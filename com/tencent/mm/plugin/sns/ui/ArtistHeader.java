package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.fq;
import com.tencent.mm.protocal.protobuf.fr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.az;

public class ArtistHeader extends LinearLayout
  implements b.b
{
  private Context context;
  private View iVh;
  private com.tencent.mm.ui.base.i mst;
  private ArtistHeader.b rgE;
  private ImageView rgF;
  private ProgressBar rgG;
  private fq rgz;

  public ArtistHeader(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(38108);
    this.rgz = null;
    this.mst = null;
    this.context = null;
    init(paramContext);
    AppMethodBeat.o(38108);
  }

  public ArtistHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38109);
    this.rgz = null;
    this.mst = null;
    this.context = null;
    init(paramContext);
    AppMethodBeat.o(38109);
  }

  private void init(final Context paramContext)
  {
    AppMethodBeat.i(38110);
    View localView = LayoutInflater.from(paramContext).inflate(2130970745, this, true);
    this.context = paramContext;
    this.rgE = new ArtistHeader.b(this);
    this.rgE.eks = ((ImageView)localView.findViewById(2131827677));
    this.rgE.hrg = ((TextView)localView.findViewById(2131827680));
    this.rgE.rgJ = ((TextView)localView.findViewById(2131827678));
    this.rgE.rgK = ((TextView)localView.findViewById(2131827681));
    this.rgE.gne = ((TextView)localView.findViewById(2131827679));
    this.rgE.eks.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(38106);
        if ((ArtistHeader.a(ArtistHeader.this) != null) && (ArtistHeader.a(ArtistHeader.this).isShowing()))
          AppMethodBeat.o(38106);
        while (true)
        {
          return;
          if (ArtistHeader.b(ArtistHeader.this) == null)
          {
            AppMethodBeat.o(38106);
          }
          else
          {
            paramAnonymousView = LayoutInflater.from(ArtistHeader.this.getContext()).inflate(2130971002, null);
            ArtistHeader.a(ArtistHeader.this, new com.tencent.mm.ui.base.i(ArtistHeader.this.getContext(), 2131493866));
            paramAnonymousView.setOnClickListener(new ArtistHeader.1.1(this));
            ArtistHeader.a(ArtistHeader.this).setCanceledOnTouchOutside(true);
            ArtistHeader.a(ArtistHeader.this).setContentView(paramAnonymousView);
            ArtistHeader.a(ArtistHeader.this).show();
            ArtistHeader.a(ArtistHeader.this, (ImageView)paramAnonymousView.findViewById(2131828433));
            ArtistHeader.a(ArtistHeader.this, (ProgressBar)paramAnonymousView.findViewById(2131828435));
            ArtistHeader.a(ArtistHeader.this, paramAnonymousView.findViewById(2131828434));
            paramAnonymousView = af.cnC().a(ArtistHeader.b(ArtistHeader.this).vHA.vHB, ArtistHeader.c(ArtistHeader.this), paramContext.hashCode(), true, az.xYU, false);
            if (com.tencent.mm.plugin.sns.data.i.B(paramAnonymousView))
            {
              ArtistHeader.a(ArtistHeader.this, paramAnonymousView);
              ArtistHeader.d(ArtistHeader.this).setVisibility(4);
              ArtistHeader.e(ArtistHeader.this).setVisibility(4);
              AppMethodBeat.o(38106);
            }
            else
            {
              af.cnC().b(ArtistHeader.b(ArtistHeader.this).vHA.vHB, ArtistHeader.c(ArtistHeader.this), paramContext.hashCode(), az.xYU);
              AppMethodBeat.o(38106);
            }
          }
        }
      }
    });
    AppMethodBeat.o(38110);
  }

  public final void Xw(String paramString)
  {
  }

  public final void bj(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(38112);
    if (this.rgz == null)
      AppMethodBeat.o(38112);
    while (true)
    {
      return;
      if ((this.mst != null) && (this.mst.isShowing()))
      {
        if (!paramBoolean)
        {
          bau localbau = this.rgz.vHA.vHB;
          if ((localbau.Id != null) && (localbau.Id.equals(paramString)))
          {
            Toast.makeText(this.context, this.context.getString(2131303619), 0).show();
            AppMethodBeat.o(38112);
          }
        }
        else if (this.rgF != null)
        {
          this.rgF.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(38107);
              Bitmap localBitmap = af.cnC().a(ArtistHeader.b(ArtistHeader.this).vHA.vHB, ArtistHeader.c(ArtistHeader.this), ArtistHeader.f(ArtistHeader.this).hashCode(), true, az.xYU, false);
              if (com.tencent.mm.plugin.sns.data.i.B(localBitmap))
              {
                ArtistHeader.a(ArtistHeader.this, localBitmap);
                ArtistHeader.d(ArtistHeader.this).setVisibility(4);
                ArtistHeader.e(ArtistHeader.this).setVisibility(4);
                AppMethodBeat.o(38107);
              }
              while (true)
              {
                return;
                AppMethodBeat.o(38107);
              }
            }
          });
        }
      }
      else
        AppMethodBeat.o(38112);
    }
  }

  public final void bk(String paramString, boolean paramBoolean)
  {
  }

  public final void cmu()
  {
  }

  public void setBackClickListener(ArtistHeader.a parama)
  {
  }

  public void setUserName(fq paramfq)
  {
    AppMethodBeat.i(38111);
    if (paramfq == null)
    {
      ab.e("MicroMsg.ArtistHeader", "userName or selfName is null ");
      AppMethodBeat.o(38111);
    }
    while (true)
    {
      return;
      this.rgz = paramfq;
      af.cnC().b(paramfq.vHA.vHB, this.rgE.eks, this.context.hashCode(), az.xYU);
      this.rgE.rgJ.setText(paramfq.Name);
      this.rgE.hrg.setText(paramfq.vEA);
      this.rgE.gne.setText(paramfq.Title);
      this.rgE.rgK.setText(paramfq.vHz);
      AppMethodBeat.o(38111);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ArtistHeader
 * JD-Core Version:    0.6.2
 */