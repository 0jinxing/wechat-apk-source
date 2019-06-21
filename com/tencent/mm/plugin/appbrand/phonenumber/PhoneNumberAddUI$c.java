package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddUI$onCreate$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "plugin-appbrand-integration_release"})
public final class PhoneNumberAddUI$c
  implements TextWatcher
{
  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(134818);
    paramCharSequence = this.ixX.ixU;
    boolean bool;
    if (paramCharSequence != null)
    {
      Object localObject = this.ixX.ixR;
      if (localObject != null)
      {
        localObject = ((MMFormVerifyCodeInputView)localObject).getText();
        if ((localObject != null) && (((Editable)localObject).length() == 0));
      }
      else
      {
        localObject = this.ixX.ixS;
        if (localObject != null)
        {
          localObject = ((MMFormInputView)localObject).getText();
          if ((localObject != null) && (((Editable)localObject).length() == 0));
        }
        else
        {
          bool = true;
          paramCharSequence.setEnabled(bool);
          AppMethodBeat.o(134818);
        }
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      AppMethodBeat.o(134818);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI.c
 * JD-Core Version:    0.6.2
 */