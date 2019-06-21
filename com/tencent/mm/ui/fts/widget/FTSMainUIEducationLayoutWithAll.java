package com.tencent.mm.ui.fts.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSMainUIEducationLayout;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class FTSMainUIEducationLayoutWithAll extends FTSMainUIEducationLayout
{
  public FTSMainUIEducationLayoutWithAll(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public FTSMainUIEducationLayoutWithAll(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void eF(String paramString, int paramInt)
  {
    AppMethodBeat.i(91588);
    LinearLayout localLinearLayout = (LinearLayout)inflate(getContext(), 2130969631, null);
    localLinearLayout.findViewById(2131824250).setOnClickListener(this.mJH);
    ((TextView)localLinearLayout.findViewById(2131824250)).setText(paramString);
    this.mMf.add(localLinearLayout);
    this.mMg.put(Integer.valueOf(paramInt), (TextView)localLinearLayout.findViewById(2131824250));
    addView(localLinearLayout);
    AppMethodBeat.o(91588);
  }

  public final boolean T(JSONObject paramJSONObject)
  {
    boolean bool = false;
    AppMethodBeat.i(91589);
    if (paramJSONObject == null)
      AppMethodBeat.o(91589);
    JSONArray localJSONArray;
    while (true)
    {
      return bool;
      localJSONArray = paramJSONObject.optJSONArray("items");
      if (localJSONArray != null)
        break;
      AppMethodBeat.o(91589);
    }
    int i;
    int j;
    Object localObject1;
    Object localObject2;
    String str1;
    String str2;
    label77: JSONObject localJSONObject;
    if (aa.gw(ah.getContext()).equalsIgnoreCase("en"))
    {
      i = com.tencent.mm.bz.a.al(getContext(), 2131427508);
      j = 0;
      localObject1 = null;
      localObject2 = null;
      str1 = null;
      str2 = null;
      if (j >= localJSONArray.length())
        break label196;
      localJSONObject = localJSONArray.optJSONObject(j);
      if (j % 3 != 0)
        break label134;
      str2 = localJSONObject.optString("hotword");
      localObject2 = localJSONObject;
    }
    while (true)
    {
      j++;
      break label77;
      i = com.tencent.mm.bz.a.al(getContext(), 2131427813);
      break;
      label134: if (j % 3 == 1)
      {
        str1 = localJSONObject.optString("hotword");
        localObject1 = localJSONObject;
      }
      else
      {
        a(str2, localObject2, str1, localObject1, localJSONObject.optString("hotword"), localJSONObject, i);
        localObject1 = null;
        localObject2 = null;
        str1 = null;
        str2 = null;
      }
    }
    label196: if ((str2 != null) && (localObject2 != null))
      a(str2, localObject2, str1, localObject1, null, null, i);
    paramJSONObject = paramJSONObject.optJSONArray("all");
    if ((paramJSONObject == null) || (paramJSONObject.length() == 0))
      bBw();
    while (true)
    {
      AppMethodBeat.o(91589);
      bool = true;
      break;
      paramJSONObject = paramJSONObject.optJSONObject(0);
      eF(paramJSONObject.optString("hotword"), paramJSONObject.optInt("businessType"));
    }
  }

  public final void bBw()
  {
    AppMethodBeat.i(91587);
    eF(getContext().getResources().getString(2131302855), com.tencent.mm.bd.a.a(null, getContext().getString(2131302855), getContext()));
    AppMethodBeat.o(91587);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.fts.widget.FTSMainUIEducationLayoutWithAll
 * JD-Core Version:    0.6.2
 */