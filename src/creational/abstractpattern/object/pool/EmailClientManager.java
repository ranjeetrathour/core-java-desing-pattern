package creational.abstractpattern.object.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * This class manages an object pool for EmailClient instances,
 * ensuring efficient reuse of objects to reduce overhead.
 */
public class EmailClientManager {

    private static final Logger logger = Logger.getLogger(EmailClientManager.class.getName());

    // List to hold email clients that are free and available for use.(it is pool)
    List<EmailClient> freeEmailClientConnectionToUse = new ArrayList<>();

    // List to hold email clients that are currently in use.
    List<EmailClient> currentlyUsesEmailClient = new ArrayList<>();

    // Initial number of objects to create in the pool.
    private final int INITIAL_POOL_SIZE = 3;

    // Maximum number of objects allowed in the pool.
    private final int MAX_POOL_SIZE = 6;

    /**
     * this will add object in the pool with initial value
     */
    public EmailClientManager() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            freeEmailClientConnectionToUse.add(new EmailClient()); // Add a new EmailClient to the free pool.
        }
    }

    /**
     * This method provides an EmailClient object from the pool.
     * - If no free object is available but the pool size is below the maximum, a new object is created.
     * - If the maximum pool size is reached and all objects are in use, it returns null.
     *
     * @return An EmailClient instance or null if no object is available.
     */
    public EmailClient getEmailClientConnectionFromManager() {
        // Check if the free pool is empty and we can still create more objects.
        if (freeEmailClientConnectionToUse.isEmpty() && currentlyUsesEmailClient.size() < MAX_POOL_SIZE) {
            freeEmailClientConnectionToUse.add(new EmailClient()); // Create and add a new EmailClient to the free pool.
            logger.info("Creating and adding a new object to the pool.");
        }
        // If all objects are in use and the maximum pool size is reached, log and return null.
        else if (freeEmailClientConnectionToUse.isEmpty() && currentlyUsesEmailClient.size() >= MAX_POOL_SIZE) {
            logger.info("Cannot provide object. All objects are in use. Please wait until one is released.");
            return null; // No object available.
        }

        // Retrieve the last available object from the free pool.
        EmailClient emailClient = freeEmailClientConnectionToUse.remove(freeEmailClientConnectionToUse.size() - 1);

        // Move the object to the currently in-use list.
        currentlyUsesEmailClient.add(emailClient);

        // Return the retrieved object.
        return emailClient;
    }

    /**
     * This method releases an EmailClient object and returns it to the free pool.
     * It ensures that the object can be reused by other clients.
     *
     * @param emailClient The EmailClient instance to release.
     */
    public void releasedEmailClient(EmailClient emailClient) {
        // Add the released object back to the free pool.
        freeEmailClientConnectionToUse.add(emailClient);

        // Remove the object from the in-use list.
        currentlyUsesEmailClient.remove(emailClient);
    }
}
