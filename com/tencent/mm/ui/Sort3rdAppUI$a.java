package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import java.util.List;

final class Sort3rdAppUI$a extends ArrayAdapter<f>
{
  List<f> kSg;
  private c lyr;
  private Context mContext;
  private long wPF;

  public Sort3rdAppUI$a(Context paramContext, List<f> paramList, long paramLong)
  {
    super(paramContext, 2130970835, paramList);
    AppMethodBeat.i(29902);
    this.wPF = paramLong;
    this.mContext = paramContext;
    this.kSg = paramList;
    paramContext = new c.a();
    paramContext.ePT = 2130839645;
    this.lyr = paramContext.ahG();
    AppMethodBeat.o(29902);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = true;
    AppMethodBeat.i(29903);
    f localf;
    Object localObject;
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, 2130970835, null);
      paramViewGroup = new Sort3rdAppUI.a.a(paramView);
      paramView.setTag(paramViewGroup);
      localf = (f)getItem(paramInt);
      paramViewGroup.gnB.setText(localf.field_appName);
      localObject = g.b(localf.field_appId, 1, com.tencent.mm.bz.a.getDensity(this.mContext));
      if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
        break label166;
      paramViewGroup.iqT.setImageBitmap((Bitmap)localObject);
      label100: localObject = paramViewGroup.ixT;
      if ((localf.field_appInfoFlag & 0x4000) != 0)
        break label188;
    }
    while (true)
    {
      ((MMSwitchBtn)localObject).setCheck(bool);
      paramViewGroup.ixT.setSwitchListener(new Sort3rdAppUI.a.1(this, localf));
      paramView.setVisibility(0);
      AppMethodBeat.o(29903);
      return paramView;
      paramViewGroup = (Sort3rdAppUI.a.a)paramView.getTag();
      break;
      label166: o.ahp().a(localf.field_appIconUrl, paramViewGroup.iqT, this.lyr);
      break label100;
      label188: bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.Sort3rdAppUI.a
 * JD-Core Version:    0.6.2
 */