package com.tencent.mm.plugin.emoji.ui.v2;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.a.a;
import com.tencent.mm.plugin.emoji.a.f;
import com.tencent.mm.plugin.emoji.ui.BaseEmojiStoreUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class EmojiStoreV2RankUI extends BaseEmojiStoreUI
{
  public final int bkM()
  {
    return 5;
  }

  public final int bkN()
  {
    return 105;
  }

  public final a bkO()
  {
    AppMethodBeat.i(53667);
    f localf = new f(this.mController.ylL);
    AppMethodBeat.o(53667);
    return localf;
  }

  public final int bkV()
  {
    return 10;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final void initView()
  {
    AppMethodBeat.i(53666);
    super.initView();
    setMMTitle(2131299123);
    AppMethodBeat.o(53666);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(53665);
    super.onCreate(paramBundle);
    h.pYm.e(12740, new Object[] { Integer.valueOf(4), "", "", "", Integer.valueOf(5), Integer.valueOf(5) });
    AppMethodBeat.o(53665);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RankUI
 * JD-Core Version:    0.6.2
 */