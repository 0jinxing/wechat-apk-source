package android.support.v4.app;

import android.app.Notification;

public final class y$b
  implements y.e
{
  final Notification FM;
  final int id;
  final String packageName;
  final String tag;

  public y$b(String paramString, int paramInt, Notification paramNotification)
  {
    this.packageName = paramString;
    this.id = paramInt;
    this.tag = null;
    this.FM = paramNotification;
  }

  public final void a(q paramq)
  {
    paramq.a(this.packageName, this.id, this.tag, this.FM);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("NotifyTask[");
    localStringBuilder.append("packageName:").append(this.packageName);
    localStringBuilder.append(", id:").append(this.id);
    localStringBuilder.append(", tag:").append(this.tag);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.y.b
 * JD-Core Version:    0.6.2
 */