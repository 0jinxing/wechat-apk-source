package com.tencent.mm.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class MMAppMgr$2 extends ClickableSpan
{
  MMAppMgr$2(Activity paramActivity)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29548);
    bo.M(this.ghG, ah.getResources().getString(2131305909, new Object[] { aa.gw(this.ghG), aa.doq(), "setting", Integer.valueOf(0), Integer.valueOf(0) }));
    AppMethodBeat.o(29548);
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(29549);
    paramTextPaint.setColor(this.ghG.getResources().getColor(2131690208));
    AppMethodBeat.o(29549);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.2
 * JD-Core Version:    0.6.2
 */