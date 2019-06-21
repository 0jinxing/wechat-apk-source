package com.tencent.mm.plugin.account.security.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.account.security.a.d;
import com.tencent.mm.plugin.account.security.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.Preference;

public class SafeDeviceListPreference extends Preference
  implements f
{
  private Context context;
  private ProgressDialog ehJ;
  d gzG;
  private boolean gzH = false;
  private Button gzI;
  SafeDeviceListPreference.a gzJ;
  SafeDeviceListPreference.b gzK;
  int mode = -2;

  public SafeDeviceListPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public SafeDeviceListPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SafeDeviceListPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
  }

  private void amq()
  {
    AppMethodBeat.i(69897);
    com.tencent.mm.kernel.g.Rg().b(362, this);
    AppMethodBeat.o(69897);
  }

  final void initView()
  {
    AppMethodBeat.i(69898);
    if (!this.gzH)
    {
      ab.d("MicroMsg.SafeDeviceListPreference", "has not binded");
      AppMethodBeat.o(69898);
    }
    while (true)
    {
      return;
      switch (this.mode)
      {
      case -1:
      case 0:
      default:
        setWidgetLayoutResource(0);
        NW(0);
        AppMethodBeat.o(69898);
        break;
      case 1:
        setWidgetLayoutResource(2130969269);
        if (this.gzI != null)
          this.gzI.setOnClickListener(new SafeDeviceListPreference.3(this));
        NW(8);
        AppMethodBeat.o(69898);
        break;
      case -2:
        setWidgetLayoutResource(0);
        NW(0);
        AppMethodBeat.o(69898);
      }
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(69896);
    this.gzH = true;
    this.gzI = ((Button)paramView.findViewById(2131823254));
    initView();
    super.onBindView(paramView);
    AppMethodBeat.o(69896);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(69895);
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    if (paramViewGroup != null)
    {
      paramViewGroup.removeAllViews();
      localLayoutInflater.inflate(2130970176, paramViewGroup);
    }
    AppMethodBeat.o(69895);
    return localView;
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(69899);
    amq();
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if ((paramInt2 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.plugin.account.security.a.g.aqG().a(this.gzG, new String[0]);
      if (this.gzK == null)
        break label174;
      this.gzK.wq(this.mKey);
      AppMethodBeat.o(69899);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.account.a.a.gkF.a(this.context, paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(69899);
      }
      else
      {
        Toast.makeText(this.context, this.context.getString(2131302684, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        if (this.gzJ != null)
          this.gzJ.onFailed(this.gzG.field_uid);
        label174: AppMethodBeat.o(69899);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference
 * JD-Core Version:    0.6.2
 */