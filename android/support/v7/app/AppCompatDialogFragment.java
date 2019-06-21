package android.support.v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.Window;

public class AppCompatDialogFragment extends DialogFragment
{
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    return new i(getContext(), getTheme());
  }

  public void setupDialog(Dialog paramDialog, int paramInt)
  {
    i locali;
    if ((paramDialog instanceof i))
    {
      locali = (i)paramDialog;
      switch (paramInt)
      {
      default:
      case 3:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      return;
      paramDialog.getWindow().addFlags(24);
      locali.fA();
      continue;
      super.setupDialog(paramDialog, paramInt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.app.AppCompatDialogFragment
 * JD-Core Version:    0.6.2
 */