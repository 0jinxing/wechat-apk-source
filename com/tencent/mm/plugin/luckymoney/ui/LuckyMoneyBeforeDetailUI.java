package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.luckymoney.model.af;
import com.tencent.mm.plugin.luckymoney.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.io.IOException;

@a(3)
public class LuckyMoneyBeforeDetailUI extends LuckyMoneyBaseUI
{
  private Dialog gII;

  private void iJ(boolean paramBoolean)
  {
    AppMethodBeat.i(42581);
    ab.i("MicroMsg.LuckyMoneyBeforeDetailUI", "go to detail ui");
    LuckyMoneyBeforeDetailUI.1 local1 = new LuckyMoneyBeforeDetailUI.1(this);
    if (paramBoolean)
    {
      al.n(local1, 100L);
      AppMethodBeat.o(42581);
    }
    while (true)
    {
      return;
      local1.run();
      AppMethodBeat.o(42581);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(42579);
    ab.i("MicroMsg.LuckyMoneyBeforeDetailUI", "onSceneEnd() errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " netsceneType:" + paramm.getType());
    if ((paramm instanceof af))
    {
      if (this.gII != null)
        this.gII.dismiss();
      if ((paramInt1 == 0) && (paramInt2 == 0))
        paramString = (af)paramm;
    }
    while (true)
    {
      try
      {
        getIntent().putExtra("key_detail_info", paramString.nYn.toByteArray());
        getIntent().putExtra("key_process_content", paramString.nYz);
        getIntent().putExtra("key_detail_emoji_md5", paramString.nYA);
        getIntent().putExtra("key_detail_emoji_type", paramString.nYB);
        getIntent().putExtra("key_emoji_switch", paramString.nYC);
        iJ(true);
        AppMethodBeat.o(42579);
        return bool;
      }
      catch (IOException paramString)
      {
        ab.printErrStackTrace("MicroMsg.LuckyMoneyBeforeDetailUI", paramString, "", new Object[0]);
        finish();
        continue;
      }
      h.bQ(this, paramString);
      finish();
      AppMethodBeat.o(42579);
      continue;
      AppMethodBeat.o(42579);
      bool = false;
    }
  }

  public void finish()
  {
    AppMethodBeat.i(42580);
    super.finish();
    overridePendingTransition(0, 0);
    AppMethodBeat.o(42580);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42578);
    super.onCreate(paramBundle);
    overridePendingTransition(0, 2131034240);
    ae.m(this, getResources().getColor(2131690597));
    AM(8);
    paramBundle = getIntent().getStringExtra("key_sendid");
    String str = getIntent().getStringExtra("key_native_url");
    int i = getIntent().getIntExtra("key_jump_from", 2);
    ab.i("MicroMsg.LuckyMoneyBeforeDetailUI", "sendid=" + bo.nullAsNil(paramBundle) + ", nativeurl=" + bo.nullAsNil(str) + ", jumpFrom=" + i);
    if (i == 2);
    while (true)
    {
      try
      {
        byte[] arrayOfByte = getIntent().getByteArrayExtra("key_detail_info");
        if (arrayOfByte != null)
        {
          k localk = new com/tencent/mm/plugin/luckymoney/model/k;
          localk.<init>();
          if ((k)localk.parseFrom(arrayOfByte) != null)
          {
            iJ(false);
            AppMethodBeat.o(42578);
            return;
          }
        }
      }
      catch (Exception localException1)
      {
        ab.w("MicroMsg.LuckyMoneyBeforeDetailUI", "Parse LuckyMoneyDetail fail!" + localException1.getLocalizedMessage());
      }
      Object localObject;
      if ((bo.isNullOrNil(paramBundle)) && (!bo.isNullOrNil(str)))
        localObject = Uri.parse(str);
      while (true)
        try
        {
          localObject = ((Uri)localObject).getQueryParameter("sendid");
          paramBundle = (Bundle)localObject;
          if (bo.isNullOrNil(paramBundle))
            break label312;
          ab.i("MicroMsg.LuckyMoneyBeforeDetailUI", "get recordList");
          this.gII = h.a(this.mController.ylL, 3, 2131493296, getString(2131300968), true, new LuckyMoneyBeforeDetailUI.2(this));
          b(new af(paramBundle, 11, 0, str, "v1.0", ""), false);
          AppMethodBeat.o(42578);
        }
        catch (Exception localException2)
        {
        }
      label312: ab.w("MicroMsg.LuckyMoneyBeforeDetailUI", "sendid null or nil, finish");
      finish();
      AppMethodBeat.o(42578);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI
 * JD-Core Version:    0.6.2
 */