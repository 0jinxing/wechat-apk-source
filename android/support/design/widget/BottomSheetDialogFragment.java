package android.support.design.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;

public class BottomSheetDialogFragment extends AppCompatDialogFragment
{
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    return new c(getContext(), getTheme());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.BottomSheetDialogFragment
 * JD-Core Version:    0.6.2
 */