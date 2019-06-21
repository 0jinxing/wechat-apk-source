package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.bzi;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;

public final class o extends i
{
  private View krb;
  private ImageView krc;
  private TextView krd;
  private TextView kre;

  public final void bes()
  {
    AppMethodBeat.i(88774);
    this.krb.setVisibility(8);
    AppMethodBeat.o(88774);
  }

  public final void initView()
  {
    AppMethodBeat.i(88772);
    this.krb = findViewById(2131822017);
    this.krc = ((ImageView)findViewById(2131824180));
    this.krd = ((TextView)findViewById(2131824181));
    this.kre = ((TextView)findViewById(2131824182));
    this.krb.setVisibility(8);
    AppMethodBeat.o(88772);
  }

  public final void update()
  {
    AppMethodBeat.i(88773);
    b localb = this.kqK.bcv();
    MMActivity localMMActivity = this.kqK.bcy();
    e.a locala = this.kqK.bcC();
    this.krb.setVisibility(0);
    this.krd.setText(com.tencent.mm.pluginsdk.ui.e.j.b(localMMActivity, ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(locala.kiN).Oi(), this.krd.getTextSize()));
    if ((localb.aZX() != null) && (!TextUtils.isEmpty(localb.aZX().wYl)))
      this.kre.setText(com.tencent.mm.pluginsdk.ui.e.j.b(localMMActivity, localb.aZX().wYl, this.kre.getTextSize()));
    while (true)
    {
      a.b.b(this.krc, locala.kiN);
      this.krc.setOnClickListener(this.kqK.bcz());
      AppMethodBeat.o(88773);
      return;
      if (!TextUtils.isEmpty(localb.aZV().kdf))
      {
        if (localb.aZH())
          this.kre.setText(localMMActivity.getString(2131297896, new Object[] { localb.aZV().kdf }));
        else
          this.kre.setText(localMMActivity.getString(2131297874, new Object[] { localb.aZV().kdf }));
      }
      else if (localb.aZH())
        this.kre.setText(localMMActivity.getString(2131297896, new Object[] { this.kqK.bcD().getTitle() }));
      else
        this.kre.setText(localMMActivity.getString(2131297874, new Object[] { this.kqK.bcD().getTitle() }));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.o
 * JD-Core Version:    0.6.2
 */