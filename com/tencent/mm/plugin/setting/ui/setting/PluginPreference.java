package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public final class PluginPreference extends Preference
  implements d.a
{
  private MMActivity crP;
  private ImageView gvq;
  int lXY;
  private String pnJ;
  String qlc;
  String qld;
  private int qle;
  private int qlf;
  boolean qlg;

  public PluginPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public PluginPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PluginPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(126980);
    this.pnJ = "";
    this.qle = -1;
    this.qlf = 8;
    this.qlg = false;
    this.gvq = null;
    this.lXY = 255;
    this.crP = ((MMActivity)paramContext);
    setLayoutResource(2130970127);
    o.acd().a(this);
    AppMethodBeat.o(126980);
  }

  private void cfI()
  {
    AppMethodBeat.i(126982);
    if (this.gvq != null)
      a.b.b(this.gvq, this.qlc);
    AppMethodBeat.o(126982);
  }

  public final boolean Ww(String paramString)
  {
    AppMethodBeat.i(126981);
    paramString = ((j)g.K(j.class)).XM().aoO(paramString);
    boolean bool;
    if ((paramString == null) || ((int)paramString.ewQ == 0))
    {
      ab.e("MicroMsg.PluginPreference", "plugin do not exist");
      bool = false;
      AppMethodBeat.o(126981);
    }
    while (true)
    {
      return bool;
      this.qlc = paramString.field_username;
      this.qld = paramString.Oi();
      setKey("settings_plugins_list_#" + this.qlc);
      bool = true;
      AppMethodBeat.o(126981);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(126984);
    super.onBindView(paramView);
    this.gvq = ((ImageView)paramView.findViewById(2131822184));
    this.gvq.setAlpha(this.lXY);
    TextView localTextView = (TextView)paramView.findViewById(2131822348);
    if (localTextView != null)
    {
      localTextView.setVisibility(this.qlf);
      localTextView.setText(this.pnJ);
      if (this.qle != -1)
        localTextView.setBackgroundDrawable(com.tencent.mm.bz.a.g(this.crP, this.qle));
    }
    paramView = (TextView)paramView.findViewById(2131825070);
    if (paramView != null)
      if (!this.qlg)
        break label125;
    label125: for (int i = 0; ; i = 8)
    {
      paramView.setVisibility(i);
      cfI();
      AppMethodBeat.o(126984);
      return;
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(126983);
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    localLayoutInflater.inflate(2130970160, paramViewGroup);
    AppMethodBeat.o(126983);
    return localView;
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(126985);
    if ((this.qlc != null) && (this.qlc.equals(paramString)))
      new ak(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(126979);
          PluginPreference.a(PluginPreference.this);
          AppMethodBeat.o(126979);
        }
      });
    AppMethodBeat.o(126985);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.PluginPreference
 * JD-Core Version:    0.6.2
 */