package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.scanner.util.q;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.io.IOException;

public final class d extends Preference
  implements x.a
{
  private f ehK;
  private TextView iDT;
  private ImageView kEn;
  String kux;
  private View mView;
  String mXp;
  private TextView qcc;
  String qcd;

  public d(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(81006);
    this.mView = null;
    this.kEn = null;
    this.iDT = null;
    this.qcc = null;
    setLayoutResource(2130970379);
    x.a(this);
    AppMethodBeat.o(81006);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(81007);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(81007);
    return paramView;
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(81009);
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals(this.qcd)) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.kEn.setImageBitmap(paramBitmap);
      this.kEn.setBackgroundColor(0);
      if (this.ehK != null)
        this.ehK.notifyDataSetChanged();
    }
    AppMethodBeat.o(81009);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(81008);
    super.onBindView(paramView);
    this.kEn = ((ImageView)paramView.findViewById(2131826572));
    this.iDT = ((TextView)paramView.findViewById(2131826573));
    this.qcc = ((TextView)paramView.findViewById(2131826574));
    Object localObject;
    if (!bo.isNullOrNil(this.qcd))
    {
      localObject = x.a(new q(this.qcd));
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
      {
        this.kEn.setImageBitmap((Bitmap)localObject);
        this.kEn.setBackgroundColor(0);
        if (bo.isNullOrNil(this.kux))
          break label289;
        this.iDT.setText(j.b(this.mContext, this.kux, this.iDT.getTextSize()));
        label136: if (bo.isNullOrNil(this.mXp))
          break label301;
        this.qcc.setText(this.mXp);
      }
    }
    while (true)
    {
      while (true)
      {
        if ((bo.isNullOrNil(this.kux)) && (bo.isNullOrNil(this.qcd)))
        {
          paramView = (LinearLayout)paramView.findViewById(2131826571);
          localObject = paramView.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject).height = this.mContext.getResources().getDimensionPixelSize(2131428597);
          paramView.setPadding(BackwardSupportUtil.b.b(this.mContext, 9.0F), 0, 0, 0);
          paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
        AppMethodBeat.o(81008);
        return;
        try
        {
          localObject = BackwardSupportUtil.b.b(ah.getContext().getAssets().open("avatar/default_nor_avatar.png"), a.getDensity(null));
          this.kEn.setImageBitmap((Bitmap)localObject);
        }
        catch (IOException localIOException)
        {
          this.kEn.setImageBitmap(null);
        }
      }
      break;
      this.kEn.setVisibility(8);
      break;
      label289: this.iDT.setVisibility(8);
      break label136;
      label301: this.qcc.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.d
 * JD-Core Version:    0.6.2
 */