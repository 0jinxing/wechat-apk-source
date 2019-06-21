package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelstat.k;
import com.tencent.mm.modelstat.m;
import com.tencent.mm.modelstat.q;
import com.tencent.mm.plugin.setting.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.Preference;

public class NetStatPreference extends Preference
{
  boolean qkW;

  public NetStatPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public NetStatPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(126966);
    this.qkW = false;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.NetStatPreference, paramInt, 0);
    if (paramAttributeSet.getInt(0, 0) == 1);
    for (boolean bool = true; ; bool = false)
    {
      this.qkW = bool;
      paramAttributeSet.recycle();
      setSummary(paramContext.getString(2131303173, new Object[] { Integer.valueOf(15) }));
      AppMethodBeat.o(126966);
      return;
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(126968);
    super.onBindView(paramView);
    LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(2131826032);
    localLinearLayout.removeAllViews();
    int i = (int)(System.currentTimeMillis() / 86400000L);
    for (int j = 15; j > 0; j -= 5)
    {
      localNetStatGroup = new NetStatGroup(this.mContext);
      int k = i - j + 1;
      bool = this.qkW;
      localObject = DateFormat.format(localNetStatGroup.getContext().getString(2131299933, new Object[] { "" }), k * 86400000L).toString();
      localNetStatGroup.qkV.setText((CharSequence)localObject);
      ab.d("MicroMsg.NetStatGroup", "NetStat dataTime = ".concat(String.valueOf(localObject)));
      localNetStatGroup.qkU.removeAllViews();
      int m = 0;
      if (m < 5)
      {
        NetStatUnit localNetStatUnit = new NetStatUnit(localNetStatGroup.getContext());
        localObject = q.aks().md(k + m);
        int n;
        int i1;
        int i2;
        if (localObject != null)
        {
          if (!bool)
            break label320;
          ab.i("MicroMsg.NetStatUnit", "dknetflow peroid:%d wifi : %d %d %d %d", new Object[] { Integer.valueOf(((k)localObject).fSZ), Integer.valueOf(((k)localObject).fTv), Integer.valueOf(((k)localObject).fTj), Integer.valueOf(((k)localObject).fTx), Integer.valueOf(((k)localObject).fTl) });
          n = ((k)localObject).fTv;
          i1 = ((k)localObject).fTj;
          i2 = ((k)localObject).fTx;
          localNetStatUnit.fg(n + i1, ((k)localObject).fTl + i2);
        }
        while (true)
        {
          localNetStatUnit.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0F));
          localNetStatGroup.qkU.addView(localNetStatUnit);
          m++;
          break;
          label320: ab.i("MicroMsg.NetStatUnit", "dknetflow peroid:%d mobile : %d %d %d %d", new Object[] { Integer.valueOf(((k)localObject).fSZ), Integer.valueOf(((k)localObject).fTu), Integer.valueOf(((k)localObject).fTi), Integer.valueOf(((k)localObject).fTw), Integer.valueOf(((k)localObject).fTk) });
          i1 = ((k)localObject).fTu;
          i2 = ((k)localObject).fTi;
          n = ((k)localObject).fTw;
          localNetStatUnit.fg(i1 + i2, ((k)localObject).fTk + n);
        }
      }
      localLinearLayout.addView(localNetStatGroup, -2, -1);
    }
    localLinearLayout = (LinearLayout)paramView.findViewById(2131826047);
    localLinearLayout.removeAllViews();
    NetStatGroup localNetStatGroup = new NetStatGroup(this.mContext);
    boolean bool = this.qkW;
    localNetStatGroup.removeAllViews();
    View.inflate(localNetStatGroup.getContext(), 2130970295, localNetStatGroup);
    localNetStatGroup.qkU = ((LinearLayout)localNetStatGroup.findViewById(2131826032));
    Object localObject = new NetStatRuler(localNetStatGroup.getContext());
    if (bool);
    for (paramView = "wifi"; ; paramView = "mobile")
    {
      ((NetStatRuler)localObject).setTag(paramView);
      ((NetStatRuler)localObject).setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0F));
      localNetStatGroup.qkU.addView((View)localObject);
      localLinearLayout.addView(localNetStatGroup);
      NW(8);
      AppMethodBeat.o(126968);
      return;
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(126967);
    View localView = super.onCreateView(paramViewGroup);
    paramViewGroup = (ViewGroup)localView.findViewById(2131821019);
    paramViewGroup.removeAllViews();
    View.inflate(this.mContext, 2130970158, paramViewGroup);
    AppMethodBeat.o(126967);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.NetStatPreference
 * JD-Core Version:    0.6.2
 */