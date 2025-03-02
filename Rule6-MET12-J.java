class MyFrame extends JFrame {
  private byte[] buffer = new byte[16 * 1024 * 1024];
  // Persists for at least two GC cycles
}