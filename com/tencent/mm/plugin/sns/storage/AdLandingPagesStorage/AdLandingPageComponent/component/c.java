package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends a
{
  int clickCount;
  LinearLayout mpt;
  private ImageView qYZ;
  private ImageView qZa;
  private TextView qZb;
  LinearLayout qZc;

  public c(Context paramContext, d paramd, ViewGroup paramViewGroup)
  {
    super(paramContext, paramd, paramViewGroup);
  }

  public final boolean al(JSONObject paramJSONObject)
  {
    boolean bool = false;
    AppMethodBeat.i(37037);
    if (!super.al(paramJSONObject))
      AppMethodBeat.o(37037);
    while (true)
    {
      return bool;
      try
      {
        paramJSONObject.put("clickCount", this.clickCount);
        bool = true;
        AppMethodBeat.o(37037);
      }
      catch (JSONException paramJSONObject)
      {
        ab.printErrStackTrace("AdLandingBorderedComp", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(37037);
      }
    }
  }

  public final void cpk()
  {
    AppMethodBeat.i(37036);
    if (((d)this.qZo).qWc.isEmpty())
      AppMethodBeat.o(37036);
    while (true)
    {
      return;
      View localView = this.contentView;
      this.qYZ = ((ImageView)localView.findViewById(2131822736));
      this.qZa = ((ImageView)localView.findViewById(2131821517));
      this.qZb = ((TextView)localView.findViewById(2131821095));
      this.mpt = ((LinearLayout)localView.findViewById(2131821064));
      this.qZc = ((LinearLayout)localView.findViewById(2131827633));
      AppMethodBeat.o(37036);
    }
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37035);
    this.qZb.setText((CharSequence)((d)this.qZo).qWc.get(0));
    if (((d)this.qZo).qWW)
    {
      this.qYZ.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2130840422));
      this.qZa.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2130840047));
      this.qZb.setTextColor(-16777216);
      this.qZc.setBackgroundResource(2130837663);
    }
    while (true)
    {
      this.qZc.setPadding((int)((d)this.qZo).qWS, 0, (int)((d)this.qZo).qWT, 0);
      this.mpt.setPadding(0, (int)((d)this.qZo).qWQ, 0, (int)((d)this.qZo).qWR);
      a(this.qZc);
      this.qZc.setOnClickListener(new c.1(this));
      AppMethodBeat.o(37035);
      return;
      this.qYZ.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2130840421));
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c
 * JD-Core Version:    0.6.2
 */