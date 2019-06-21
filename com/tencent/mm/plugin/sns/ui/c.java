package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.a.b;
import com.tencent.mm.plugin.sns.storage.a.b.a;
import com.tencent.mm.plugin.sns.storage.b.a;
import com.tencent.mm.plugin.sns.storage.b.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class c extends BaseAdapter
{
  public int hzv;
  private final Context mContext;
  private String nJy;
  public com.tencent.mm.plugin.sns.data.b rfZ;

  public c(Context paramContext, com.tencent.mm.plugin.sns.data.b paramb)
  {
    AppMethodBeat.i(38073);
    this.rfZ = null;
    this.nJy = null;
    this.hzv = 0;
    this.mContext = paramContext;
    this.rfZ = paramb;
    this.nJy = aa.gw(ah.getContext());
    AppMethodBeat.o(38073);
  }

  public final int getCount()
  {
    AppMethodBeat.i(38074);
    int i;
    if (this.hzv == 1)
    {
      i = this.rfZ.qFH.rDn.qTP.coJ().size();
      AppMethodBeat.o(38074);
    }
    while (true)
    {
      return i;
      i = 0;
      if (this.rfZ.qFH.rDm.qUZ != null)
        i = this.rfZ.qFH.rDm.qUZ.list.size();
      i++;
      AppMethodBeat.o(38074);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(38076);
    Object localObject = this.rfZ.qFH.rDn.qTP.coJ().get(paramInt);
    AppMethodBeat.o(38076);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(38075);
    View localView = paramView;
    if (paramView == null)
      localView = View.inflate(this.mContext, 2130968633, null);
    localView.setTag(this.rfZ);
    paramViewGroup = "";
    Object localObject;
    if (this.hzv == 1)
    {
      localObject = (a.b.a)getItem(paramInt);
      if ("zh_CN".equals(this.nJy))
      {
        paramViewGroup = ((a.b.a)localObject).qTZ;
        paramView = paramViewGroup;
        if (bo.isNullOrNil(paramViewGroup))
          paramView = ((a.b.a)localObject).qUb;
        label87: paramViewGroup = (TextView)localView.findViewById(2131821033);
        if (!this.rfZ.qFH.rDn.qTT)
          break label457;
        paramViewGroup.setTextColor(Color.parseColor("#3A3A3A"));
        label123: paramViewGroup.setText(paramView);
        paramView = localView.findViewById(2131821034);
        if (paramInt != getCount() - 1)
          break label469;
      }
    }
    label310: label457: label469: for (paramInt = 8; ; paramInt = 0)
    {
      paramView.setVisibility(paramInt);
      AppMethodBeat.o(38075);
      return localView;
      if (("zh_TW".equals(this.nJy)) || ("zh_HK".equals(this.nJy)))
      {
        paramViewGroup = ((a.b.a)localObject).qUa;
        break;
      }
      paramViewGroup = ((a.b.a)localObject).qUb;
      break;
      if (paramInt == 0)
      {
        paramView = paramViewGroup;
        if (this.rfZ == null)
          break label87;
        paramView = paramViewGroup;
        if (this.rfZ.qFH.rDm == null)
          break label87;
        paramView = this.rfZ.qFH.rDn;
        if ("zh_CN".equals(this.nJy))
          paramView = paramView.qTQ;
        while (true)
        {
          if (bo.isNullOrNil(paramView))
            break label310;
          break;
          if (("zh_TW".equals(this.nJy)) || ("zh_HK".equals(this.nJy)))
            paramView = paramView.qTS;
          else
            paramView = paramView.qTR;
        }
        paramView = this.mContext.getString(2131303585);
        break label87;
      }
      localObject = this.rfZ.qFH.rDm.qUZ;
      paramView = paramViewGroup;
      if (localObject == null)
        break label87;
      paramView = paramViewGroup;
      if (paramInt > ((b.a)localObject).list.size())
        break label87;
      localObject = (b.b)((b.a)localObject).list.get(paramInt - 1);
      if ("zh_CN".equals(this.nJy))
        paramViewGroup = ((b.b)localObject).qVi;
      while (true)
      {
        paramView = paramViewGroup;
        if (!bo.isNullOrNil(paramViewGroup))
          break;
        paramView = ((b.b)localObject).qOI;
        break;
        if (("zh_TW".equals(this.nJy)) || ("zh_HK".equals(this.nJy)))
          paramViewGroup = ((b.b)localObject).qVj;
        else
          paramViewGroup = ((b.b)localObject).qOI;
      }
      paramViewGroup.setTextColor(Color.parseColor("#576B95"));
      break label123;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.c
 * JD-Core Version:    0.6.2
 */