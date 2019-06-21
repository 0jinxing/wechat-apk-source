package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

final class f$a extends ContentObserver
{
  f$a(f paramf)
  {
    super(new Handler());
  }

  public final boolean deliverSelfNotifications()
  {
    return true;
  }

  public final void onChange(boolean paramBoolean)
  {
    this.PO.onContentChanged();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.f.a
 * JD-Core Version:    0.6.2
 */