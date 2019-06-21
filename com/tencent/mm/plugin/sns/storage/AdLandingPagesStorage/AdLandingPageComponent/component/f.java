package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends a
{
  int clickCount;
  private LinearLayout mpt;
  private ImageView qZa;
  private TextView qZb;
  private LinearLayout qZc;
  g qZj;
  private View qZk;
  private ImageView qZl;

  public f(Context paramContext, g paramg, ViewGroup paramViewGroup)
  {
    super(paramContext, paramg, paramViewGroup);
    this.qZj = paramg;
  }

  public final boolean al(JSONObject paramJSONObject)
  {
    boolean bool = false;
    AppMethodBeat.i(37060);
    if (!super.al(paramJSONObject))
      AppMethodBeat.o(37060);
    while (true)
    {
      return bool;
      try
      {
        paramJSONObject.put("clickCount", this.clickCount);
        bool = true;
        AppMethodBeat.o(37060);
      }
      catch (JSONException paramJSONObject)
      {
        ab.printErrStackTrace("AdLandingBorderedComp", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(37060);
      }
    }
  }

  public final void cpk()
  {
    AppMethodBeat.i(37058);
    View localView = this.contentView;
    this.qZl = ((ImageView)localView.findViewById(2131822736));
    this.qZa = ((ImageView)localView.findViewById(2131821517));
    this.qZb = ((TextView)localView.findViewById(2131821095));
    this.qZc = ((LinearLayout)localView.findViewById(2131827633));
    this.mpt = ((LinearLayout)localView.findViewById(2131821064));
    this.qZk = this.qZc;
    AppMethodBeat.o(37058);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37059);
    this.qZb.setText(this.qZj.qWe.nJx);
    if (this.qZj.qWW)
    {
      this.qZl.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2130839153));
      this.qZa.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2130840047));
      this.qZb.setTextColor(-16777216);
      this.qZc.setBackgroundResource(2130837663);
    }
    while (true)
    {
      this.qZc.setPadding((int)this.qZj.qWS, 0, (int)this.qZj.qWT, 0);
      this.mpt.setPadding(0, (int)this.qZj.qWQ, 0, (int)this.qZj.qWR);
      a(this.qZc);
      f.1 local1 = new f.1(this);
      if (this.qZk != null)
        this.qZk.setOnClickListener(local1);
      AppMethodBeat.o(37059);
      return;
      this.qZl.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2130839149));
      this.qZa.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2130840046));
      this.qZb.setTextColor(-1);
      this.qZc.setBackgroundResource(2130837664);
    }
  }

  protected final int getLayout()
  {
    return 2130970724;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f
 * JD-Core Version:    0.6.2
 */