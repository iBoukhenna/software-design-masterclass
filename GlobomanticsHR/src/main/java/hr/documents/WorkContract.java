package hr.documents;

public class WorkContract implements ExportableDocument {
    private String content;

    public WorkContract(String content) {
        this.content = content;
    }

    @Override
    public String toTxt() {
        StringBuilder sb = new StringBuilder();
        sb.append("CONTENT: ").append(this.content);
        sb.append(System.lineSeparator());
        return sb.toString();
    }

    @Override
    public byte[] toPdf() {
        return content.getBytes();
    }

    @Override
    public String toJson() {
        return "{\"content\":\"" + content + "\"}";
    }
}
