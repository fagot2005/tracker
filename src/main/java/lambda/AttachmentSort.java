package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> cmpSize =  (left, right) -> left.getSize() - right.getSize();
        attachments.sort(cmpSize);
        System.out.println(attachments);
        Comparator<Attachment> cmpDescSize =  (Attachment left, Attachment right) -> right.getName().compareTo(left.getName());
        attachments.sort(cmpDescSize);
        System.out.println(attachments);
    }
}

