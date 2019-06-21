package com.tencent.mm.plugin.emoji.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.emoji.a.a.a;
import com.tencent.mm.plugin.emoji.a.d;
import com.tencent.mm.plugin.emoji.model.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

public class EmojiPaidUI extends BaseEmojiStoreUI
{
  private com.tencent.mm.plugin.emoji.f.g[] lam;

  protected final void a(com.tencent.mm.plugin.emoji.f.g paramg)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(53398);
    if ((paramString != null) && (paramString.equals("event_update_group")))
    {
      blo();
      dS(131074, 50);
    }
    AppMethodBeat.o(53398);
  }

  protected final void a(boolean paramBoolean1, f paramf, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(53396);
    if ((paramf != null) && (paramBoolean1) && (this.kVA != null))
      this.kVA.b(paramf);
    if ((this.kVA == null) || (paramf == null) || (paramf.kVp <= 0))
    {
      this.Ek.setVisibility(0);
      this.kYa.setText(2131299067);
      this.mListView.setVisibility(8);
      AppMethodBeat.o(53396);
    }
    while (true)
    {
      return;
      this.Ek.setVisibility(8);
      this.mListView.setVisibility(0);
      AppMethodBeat.o(53396);
    }
  }

  protected final int aH(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53392);
    int i = super.aH(paramArrayOfByte);
    AppMethodBeat.o(53392);
    return i;
  }

  protected final int bkM()
  {
    return 10;
  }

  protected final int bkN()
  {
    return 6;
  }

  protected final a bkO()
  {
    AppMethodBeat.i(53397);
    d locald = new d(this.mController.ylL);
    AppMethodBeat.o(53397);
    return locald;
  }

  protected final void bkQ()
  {
  }

  protected final boolean bkS()
  {
    return false;
  }

  protected final int bkV()
  {
    return 2;
  }

  public final void initView()
  {
    AppMethodBeat.i(53393);
    setMMTitle(2131299070);
    if (r.YL())
      addIconOptionMenu(0, 2130839555, new EmojiPaidUI.1(this));
    super.initView();
    this.Ek.setVisibility(8);
    this.mListView.setVisibility(8);
    AppMethodBeat.o(53393);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(53395);
    ab.i("MicroMsg.emoji.EmojiPaidUI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    blb();
    String str = "";
    if (paramIntent != null)
    {
      paramInt1 = paramIntent.getIntExtra("key_err_code", 0);
      ab.w("MicroMsg.emoji.EmojiPaidUI", "errCode:".concat(String.valueOf(paramInt1)));
      str = paramIntent.getStringExtra("key_err_msg");
      ab.w("MicroMsg.emoji.EmojiPaidUI", "errMsg:".concat(String.valueOf(str)));
    }
    while (true)
    {
      if (paramInt2 == -1)
        if ((paramIntent != null) && (paramInt1 == 0))
        {
          paramIntent = paramIntent.getStringArrayListExtra("key_response_product_ids");
          if ((paramIntent != null) && (paramIntent.size() > 0))
          {
            this.kYe = null;
            this.kYc = -1;
            z(false, false);
            com.tencent.mm.kernel.g.RP().Ry().set(208900, Boolean.TRUE);
            Toast.makeText(this, 2131299077, 0).show();
            AppMethodBeat.o(53395);
          }
        }
      while (true)
      {
        return;
        Toast.makeText(this, str, 0).show();
        AppMethodBeat.o(53395);
        continue;
        Toast.makeText(this, str, 0).show();
        AppMethodBeat.o(53395);
        continue;
        Toast.makeText(this, 2131299076, 0).show();
        AppMethodBeat.o(53395);
      }
      paramInt1 = 0;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53391);
    super.onCreate(paramBundle);
    h.pYm.e(12740, new Object[] { Integer.valueOf(4), "", "", "", Integer.valueOf(10), Integer.valueOf(10) });
    AppMethodBeat.o(53391);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(53394);
    super.onDestroy();
    if ((this.lam != null) && (this.lam.length > 0))
      for (int i = 0; i < this.lam.length; i++)
        com.tencent.mm.kernel.g.RO().eJo.c(this.lam[i]);
    AppMethodBeat.o(53394);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiPaidUI
 * JD-Core Version:    0.6.2
 */