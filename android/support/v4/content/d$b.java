package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

final class d$b
{
  boolean Gu;
  boolean Gv;
  final IntentFilter filter;
  final BroadcastReceiver receiver;

  d$b(IntentFilter paramIntentFilter, BroadcastReceiver paramBroadcastReceiver)
  {
    this.filter = paramIntentFilter;
    this.receiver = paramBroadcastReceiver;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("Receiver{");
    localStringBuilder.append(this.receiver);
    localStringBuilder.append(" filter=");
    localStringBuilder.append(this.filter);
    if (this.Gv)
      localStringBuilder.append(" DEAD");
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.content.d.b
 * JD-Core Version:    0.6.2
 */