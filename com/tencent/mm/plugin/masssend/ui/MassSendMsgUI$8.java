package com.tencent.mm.plugin.masssend.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

final class MassSendMsgUI$8
  implements TextWatcher
{
  MassSendMsgUI$8(MassSendMsgUI paramMassSendMsgUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(22833);
    String str1 = String.valueOf(paramCharSequence);
    String str2 = str1.substring(paramInt1, paramInt1 + paramInt3);
    Bitmap localBitmap;
    if (((MassSendMsgUI.a(this.opf) == null) || (!MassSendMsgUI.a(this.opf).isShowing())) && (r.amn(str2)))
    {
      localBitmap = d.d(str2, 300, 300, false);
      if (localBitmap == null)
      {
        ab.e("MicroMsg.MassSendMsgUI", "showAlert fail, bmp is null");
        AppMethodBeat.o(22833);
      }
    }
    while (true)
    {
      return;
      paramCharSequence = new ImageView(this.opf);
      paramCharSequence.setImageBitmap(localBitmap);
      paramInt2 = this.opf.getResources().getDimensionPixelSize(2131427776);
      paramCharSequence.setPadding(paramInt2, paramInt2, paramInt2, paramInt2);
      MassSendMsgUI.a(this.opf, h.a(this.opf, this.opf.getString(2131298240), paramCharSequence, this.opf.getString(2131296994), this.opf.getString(2131296868), new MassSendMsgUI.8.1(this, str2), null));
      paramCharSequence = str1.substring(0, paramInt1) + str1.substring(paramInt1 + paramInt3);
      MassSendMsgUI.b(this.opf).u(paramCharSequence, -1, false);
      MassSendMsgUI.NW(paramCharSequence);
      AppMethodBeat.o(22833);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.8
 * JD-Core Version:    0.6.2
 */