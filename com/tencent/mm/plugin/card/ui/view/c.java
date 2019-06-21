package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.wy;

public final class c extends i
{
  private View kqx;
  private TextView kqy;

  public final void bes()
  {
    AppMethodBeat.i(88737);
    if (this.kqx != null)
      this.kqx.setVisibility(8);
    AppMethodBeat.o(88737);
  }

  public final void initView()
  {
  }

  public final void update()
  {
    AppMethodBeat.i(88736);
    if (this.kqx == null)
    {
      this.kqx = ((ViewStub)findViewById(2131822022)).inflate();
      this.kqy = ((TextView)this.kqx.findViewById(2131821940));
    }
    this.kqx.setVisibility(0);
    this.kqx.setOnClickListener(this.kqK.bcz());
    b localb = this.kqK.bcv();
    if (!TextUtils.isEmpty(localb.aZV().vUo.wcT))
    {
      this.kqy.setText(localb.aZV().vUo.wcT);
      AppMethodBeat.o(88736);
    }
    while (true)
    {
      return;
      this.kqy.setText(getString(2131297922));
      AppMethodBeat.o(88736);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.c
 * JD-Core Version:    0.6.2
 */