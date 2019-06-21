package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
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

public final class a extends i
{
  private View kqr;

  public final void bes()
  {
    AppMethodBeat.i(88730);
    this.kqr.setVisibility(8);
    AppMethodBeat.o(88730);
  }

  public final void initView()
  {
    AppMethodBeat.i(88728);
    this.kqr = findViewById(2131822018);
    AppMethodBeat.o(88728);
  }

  public final void update()
  {
    AppMethodBeat.i(88729);
    Object localObject = this.kqK.bcA();
    b localb = this.kqK.bcv();
    MMActivity localMMActivity = this.kqK.bcy();
    e.a locala = this.kqK.bcC();
    f localf = this.kqK.bcD();
    if (((com.tencent.mm.plugin.card.ui.a.g)localObject).bdP())
    {
      this.kqr.setVisibility(0);
      findViewById(2131821933).setVisibility(0);
      ImageView localImageView = (ImageView)findViewById(2131821934);
      TextView localTextView = (TextView)findViewById(2131821935);
      localObject = (TextView)findViewById(2131821936);
      if (locala.kiN != null)
        localTextView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(localMMActivity, ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(locala.kiN).Oi(), localTextView.getTextSize()));
      if (locala.emC == 23)
        if (!TextUtils.isEmpty(localb.aZV().vUw))
        {
          ((TextView)localObject).setText(localb.aZV().vUw);
          a.b.a(localImageView, locala.kiN, 0.15F, false);
          localImageView.setOnClickListener(this.kqK.bcz());
          AppMethodBeat.o(88729);
        }
    }
    while (true)
    {
      return;
      if (!TextUtils.isEmpty(localb.aZV().kdf))
      {
        ((TextView)localObject).setText(localMMActivity.getString(2131297943, new Object[] { localb.aZV().kdf }));
        break;
      }
      ((TextView)localObject).setText(localMMActivity.getString(2131297943, new Object[] { localf.getTitle() }));
      break;
      if ((localb.aZX() != null) && (!TextUtils.isEmpty(localb.aZX().wYl)))
      {
        ((TextView)localObject).setText(localb.aZX().wYl);
        break;
      }
      if (!TextUtils.isEmpty(localb.aZV().kdf))
      {
        if (localb.aZH())
        {
          ((TextView)localObject).setText(localMMActivity.getString(2131297896, new Object[] { localb.aZV().kdf }));
          break;
        }
        ((TextView)localObject).setText(localMMActivity.getString(2131297874, new Object[] { localb.aZV().kdf }));
        break;
      }
      if (localb.aZH())
      {
        ((TextView)localObject).setText(localMMActivity.getString(2131297896, new Object[] { localf.getTitle() }));
        break;
      }
      ((TextView)localObject).setText(localMMActivity.getString(2131297874, new Object[] { localf.getTitle() }));
      break;
      if (((com.tencent.mm.plugin.card.ui.a.g)localObject).bdQ())
      {
        if (!TextUtils.isEmpty(localb.aZV().vUw))
        {
          this.kqr.setVisibility(0);
          findViewById(2131821933).setVisibility(8);
          ((TextView)findViewById(2131821936)).setText(localb.aZV().vUw);
          AppMethodBeat.o(88729);
        }
        else
        {
          this.kqr.setVisibility(8);
          AppMethodBeat.o(88729);
        }
      }
      else
      {
        bes();
        AppMethodBeat.o(88729);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.a
 * JD-Core Version:    0.6.2
 */