package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.q;
import junit.framework.Assert;

public class AppHeaderPreference extends Preference
{
  private boolean cPT = false;
  private ImageView eks;
  private TextView gKr;
  private TextView gnh;
  private boolean gqJ = false;
  private TextView pnE;
  private AppHeaderPreference.a sux;

  public AppHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AppHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(AppHeaderPreference.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(25440);
    if (parama != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.sux = parama;
      this.cPT = paramBoolean;
      AppMethodBeat.o(25440);
      return;
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(25439);
    this.eks = ((ImageView)paramView.findViewById(2131821459));
    this.gnh = ((TextView)paramView.findViewById(2131822999));
    this.pnE = ((TextView)paramView.findViewById(2131821460));
    this.gKr = ((TextView)paramView.findViewById(2131821461));
    this.gqJ = true;
    if ((!this.gqJ) || (this.sux == null))
      ab.w("MicroMsg.HeaderPreference", "initView : bindView = " + this.gqJ);
    while (true)
    {
      super.onBindView(paramView);
      AppMethodBeat.o(25439);
      return;
      Object localObject = this.sux.cDL();
      if ((this.eks != null) && (localObject != null) && (!((Bitmap)localObject).isRecycled()))
        this.eks.setImageBitmap((Bitmap)localObject);
      localObject = this.sux.cDK();
      if ((this.pnE != null) && (localObject != null) && (((String)localObject).length() > 0))
        this.pnE.setText((CharSequence)localObject);
      localObject = this.sux.getHint();
      if (localObject != null)
      {
        this.gKr.setText((CharSequence)localObject);
        this.gKr.setVisibility(0);
      }
      while (true)
      {
        boolean bool = this.cPT;
        if (this.gnh == null)
          break;
        localObject = this.sux.lY(bool);
        if (!bool)
          break label314;
        if ((localObject == null) || (((String)localObject).length() <= 0))
          break label302;
        this.gnh.setTextColor(q.ii(this.mContext));
        this.gnh.setText((CharSequence)localObject);
        this.gnh.setCompoundDrawablesWithIntrinsicBounds(2130840329, 0, 0, 0);
        break;
        this.gKr.setVisibility(8);
      }
      label302: this.gnh.setVisibility(8);
      continue;
      label314: if ((localObject != null) && (((String)localObject).length() > 0))
      {
        this.gnh.setTextColor(q.ij(this.mContext));
        this.gnh.setText((CharSequence)localObject);
        this.gnh.setCompoundDrawablesWithIntrinsicBounds(2130840328, 0, 0, 0);
      }
      else
      {
        this.gnh.setVisibility(8);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.openapi.AppHeaderPreference
 * JD-Core Version:    0.6.2
 */