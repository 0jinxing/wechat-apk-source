package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.protobuf.nz;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends i
{
  private View kqC;

  public final void bes()
  {
    AppMethodBeat.i(88743);
    if (this.kqC != null)
      this.kqC.setVisibility(8);
    AppMethodBeat.o(88743);
  }

  public final void initView()
  {
  }

  public final void update()
  {
    AppMethodBeat.i(88742);
    b localb = this.kqK.bcv();
    nz localnz = localb.aZV().vUk;
    if (localnz != null)
    {
      ab.i("MicroMsg.CardAnnoucementView", "card tp annoucement  endtime: " + localnz.qsz);
      ab.i("MicroMsg.CardAnnoucementView", "card tp annoucement  text: " + localnz.text);
      ab.i("MicroMsg.CardAnnoucementView", "card tp annoucement  thumb_url: " + localnz.vTr);
    }
    if ((localnz != null) && (!TextUtils.isEmpty(localnz.text)) && (localb.aZT()))
    {
      if (this.kqC == null)
        this.kqC = ((ViewStub)findViewById(2131822026)).inflate();
      ((TextView)this.kqC.findViewById(2131821942)).setText(localnz.text);
      this.kqC.setOnClickListener(this.kqK.bcz());
      AppMethodBeat.o(88742);
    }
    while (true)
    {
      return;
      if (this.kqC != null)
        this.kqC.setVisibility(8);
      AppMethodBeat.o(88742);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.e
 * JD-Core Version:    0.6.2
 */