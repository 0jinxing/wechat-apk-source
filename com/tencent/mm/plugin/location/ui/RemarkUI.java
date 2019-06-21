package com.tencent.mm.plugin.location.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.MMTextInputUI;

public class RemarkUI extends MMTextInputUI
{
  public final void I(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(113484);
    long l = getIntent().getLongExtra("kFavInfoLocalId", -1L);
    if (l > 0L)
      if (paramCharSequence != null)
        break label150;
    label150: for (paramCharSequence = ""; ; paramCharSequence = paramCharSequence.toString())
    {
      ab.i("MicroMsg.MMTextInputUI", "same remark[%s]", new Object[] { paramCharSequence });
      if (!paramCharSequence.equals(getIntent().getStringExtra("kRemark")))
      {
        cl localcl = new cl();
        localcl.cvA.type = -2;
        localcl.cvA.cvq = Long.toString(l);
        localcl.cvA.desc = paramCharSequence;
        ab.d("MicroMsg.MMTextInputUI", "update location remark, favlocalid is %s, remark is %s", new Object[] { localcl.cvA.cvq, localcl.cvA.desc });
        a.xxA.m(localcl);
      }
      AppMethodBeat.o(113484);
      return;
    }
  }

  public final int getLayoutId()
  {
    return 2130970502;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(113483);
    super.onCreate(paramBundle);
    setMMTitle(2131300984);
    paramBundle = getIntent().getStringExtra("Kwebmap_locaion");
    if (bo.isNullOrNil(paramBundle))
    {
      findViewById(2131825268).setVisibility(8);
      AppMethodBeat.o(113483);
    }
    while (true)
    {
      return;
      ((TextView)findViewById(2131825269)).setText(paramBundle);
      AppMethodBeat.o(113483);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.RemarkUI
 * JD-Core Version:    0.6.2
 */