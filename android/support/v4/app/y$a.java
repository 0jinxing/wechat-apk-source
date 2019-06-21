package android.support.v4.app;

final class y$a
  implements y.e
{
  final boolean FL;
  final int id;
  final String packageName;
  final String tag;

  y$a(String paramString, int paramInt)
  {
    this.packageName = paramString;
    this.id = paramInt;
    this.tag = null;
    this.FL = false;
  }

  public final void a(q paramq)
  {
    if (this.FL)
      paramq.J(this.packageName);
    while (true)
    {
      return;
      paramq.b(this.packageName, this.id, this.tag);
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("CancelTask[");
    localStringBuilder.append("packageName:").append(this.packageName);
    localStringBuilder.append(", id:").append(this.id);
    localStringBuilder.append(", tag:").append(this.tag);
    localStringBuilder.append(", all:").append(this.FL);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.y.a
 * JD-Core Version:    0.6.2
 */