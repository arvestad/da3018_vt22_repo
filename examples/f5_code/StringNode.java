class StringNode {
    private String s;
    public  StringNode next;

    public StringNode(String data) {
	s = data;
	next = null;
    }

    public String get_data() {
	return s;
    }
}
