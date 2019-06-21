package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.support.v7.app.b;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

final class i
  implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, o.a
{
  private o.a aaL;
  b abL;
  f abM;
  h lo;

  public i(h paramh)
  {
    this.lo = paramh;
  }

  public final void a(h paramh, boolean paramBoolean)
  {
    if (((paramBoolean) || (paramh == this.lo)) && (this.abL != null))
      this.abL.dismiss();
    if (this.aaL != null)
      this.aaL.a(paramh, paramBoolean);
  }

  public final boolean d(h paramh)
  {
    if (this.aaL != null);
    for (boolean bool = this.aaL.d(paramh); ; bool = false)
      return bool;
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.lo.a((j)this.abM.getAdapter().getItem(paramInt), null, 0);
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    this.abM.a(this.lo, true);
  }

  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if ((paramInt == 82) || (paramInt == 4))
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        paramDialogInterface = this.abL.getWindow();
        if (paramDialogInterface == null)
          break label146;
        paramDialogInterface = paramDialogInterface.getDecorView();
        if (paramDialogInterface == null)
          break label146;
        paramDialogInterface = paramDialogInterface.getKeyDispatcherState();
        if (paramDialogInterface == null)
          break label146;
        paramDialogInterface.startTracking(paramKeyEvent, this);
      }
    while (true)
    {
      return bool;
      if ((paramKeyEvent.getAction() == 1) && (!paramKeyEvent.isCanceled()))
      {
        Object localObject = this.abL.getWindow();
        if (localObject != null)
        {
          localObject = ((Window)localObject).getDecorView();
          if (localObject != null)
          {
            localObject = ((View)localObject).getKeyDispatcherState();
            if ((localObject != null) && (((KeyEvent.DispatcherState)localObject).isTracking(paramKeyEvent)))
            {
              this.lo.U(true);
              paramDialogInterface.dismiss();
            }
          }
        }
      }
      else
      {
        label146: bool = this.lo.performShortcut(paramInt, paramKeyEvent, 0);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.i
 * JD-Core Version:    0.6.2
 */