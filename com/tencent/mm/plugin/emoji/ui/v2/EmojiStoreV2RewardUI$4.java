package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.q;

final class EmojiStoreV2RewardUI$4
  implements TextWatcher
{
  EmojiStoreV2RewardUI$4(EmojiStoreV2RewardUI paramEmojiStoreV2RewardUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(53698);
    float f1;
    if (EmojiStoreV2RewardUI.h(this.leK) != null)
      if ((paramEditable != null) && (paramEditable.length() > 0))
      {
        String str = paramEditable.toString();
        int i = str.indexOf(".");
        if ((i > 0) && (str.length() - i - 1 > 2))
          paramEditable.delete(i + 3, i + 4);
        f1 = 0.0F;
      }
    try
    {
      float f2 = Float.valueOf(paramEditable.toString()).floatValue();
      f1 = f2;
      label88: if ((f1 > 200.0F) || (f1 < 1.0F))
      {
        EmojiStoreV2RewardUI.e(this.leK).getContentEditText().setTextColor(this.leK.mController.ylL.getResources().getColor(2131690384));
        EmojiStoreV2RewardUI.h(this.leK).setEnabled(false);
        AppMethodBeat.o(53698);
      }
      while (true)
      {
        return;
        EmojiStoreV2RewardUI.e(this.leK).getContentEditText().setTextColor(this.leK.mController.ylL.getResources().getColor(2131690316));
        EmojiStoreV2RewardUI.h(this.leK).setEnabled(true);
        AppMethodBeat.o(53698);
      }
    }
    catch (NumberFormatException paramEditable)
    {
      break label88;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI.4
 * JD-Core Version:    0.6.2
 */