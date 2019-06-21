package com.tencent.mm.ui.chatting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMImageView;
import java.util.ArrayList;
import junit.framework.Assert;

final class AppAttachFileListUI$b extends BaseAdapter
{
  private AppAttachFileListUI$b(AppAttachFileListUI paramAppAttachFileListUI)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(30335);
    int i = AppAttachFileListUI.a(this.yGr).size();
    AppMethodBeat.o(30335);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(30336);
    Object localObject = AppAttachFileListUI.a(this.yGr).get(paramInt);
    AppMethodBeat.o(30336);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(30337);
    AppAttachFileListUI.c localc;
    if (paramView == null)
    {
      paramView = this.yGr.getLayoutInflater().inflate(2130968651, paramViewGroup, false);
      Assert.assertNotNull(paramView);
      paramViewGroup = new AppAttachFileListUI.d(this.yGr, (byte)0);
      paramViewGroup.yGt = ((MMImageView)paramView.findViewById(2131821104));
      paramViewGroup.yGu = ((TextView)paramView.findViewById(2131821105));
      paramViewGroup.yGv = ((TextView)paramView.findViewById(2131821107));
      paramViewGroup.yGw = ((TextView)paramView.findViewById(2131821106));
      paramView.setTag(paramViewGroup);
      Assert.assertNotNull(paramViewGroup);
      localc = (AppAttachFileListUI.c)AppAttachFileListUI.a(this.yGr).get(paramInt);
      paramViewGroup.yGu.setText(localc.yGs.title);
      if (localc.cKd.field_isSend != 1)
        break label246;
    }
    label246: for (String str = "自己"; ; str = s.mJ(localc.yGs.cEV))
    {
      paramViewGroup.yGv.setText(String.format("大小：%s，来自：%s", new Object[] { bo.ga(localc.yGs.fgo), str }));
      paramViewGroup.yGw.setText(h.c(this.yGr, localc.cKd.field_createTime, true));
      paramViewGroup.yGt.setImageResource(o.aiD(localc.yGs.fgp));
      AppMethodBeat.o(30337);
      return paramView;
      paramViewGroup = (AppAttachFileListUI.d)paramView.getTag();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachFileListUI.b
 * JD-Core Version:    0.6.2
 */