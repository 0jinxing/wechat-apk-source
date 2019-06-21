package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.model.aa;
import com.tencent.mm.plugin.game.model.aa.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.List;

public final class i extends BaseAdapter
{
  int Rt;
  private Context mContext;
  int mXC;
  private aa ngk;

  public i(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private void o(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(111816);
    paramViewGroup.setClipChildren(false);
    for (int i = 0; i < paramViewGroup.getChildCount(); i++)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ViewGroup))
      {
        ((ViewGroup)localView).setClipChildren(false);
        o((ViewGroup)localView);
      }
    }
    AppMethodBeat.o(111816);
  }

  public final void a(aa paramaa)
  {
    AppMethodBeat.i(111812);
    this.ngk = paramaa;
    al.d(new i.1(this));
    AppMethodBeat.o(111812);
  }

  public final int getCount()
  {
    AppMethodBeat.i(111813);
    int i;
    if (this.ngk == null)
    {
      i = 0;
      AppMethodBeat.o(111813);
    }
    while (true)
    {
      return i;
      i = this.ngk.mXO.size();
      AppMethodBeat.o(111813);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(111814);
    Object localObject = this.ngk.mXO.get(paramInt);
    AppMethodBeat.o(111814);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(111815);
    Object localObject1;
    Object localObject2;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.mContext).inflate(this.Rt, paramViewGroup, false);
      paramViewGroup = new i.a(this, (byte)0);
      paramViewGroup.ngm = ((TextView)paramView.findViewById(2131824453));
      paramViewGroup.gvq = ((ImageView)paramView.findViewById(2131824454));
      paramViewGroup.ngn = ((TextView)paramView.findViewById(2131824455));
      paramViewGroup.ngo = ((TextView)paramView.findViewById(2131824456));
      paramViewGroup.ngp = ((TextView)paramView.findViewById(2131824457));
      paramViewGroup.ngq = ((GameDetailRankLikeView)paramView.findViewById(2131824458));
      paramViewGroup.ngq.setSourceScene(this.mXC);
      o((ViewGroup)paramView);
      paramView.setTag(paramViewGroup);
      localObject1 = (aa.a)getItem(paramInt);
      paramViewGroup.ngm.setText(((aa.a)localObject1).mXP);
      a.b.a(paramViewGroup.gvq, ((aa.a)localObject1).cIS, 0.5F, false);
      localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(((aa.a)localObject1).cIS);
      if (localObject2 == null)
        break label325;
      localObject2 = new SpannableString(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, ((ad)localObject2).Oj(), paramViewGroup.ngn.getTextSize()));
      paramViewGroup.ngn.setText((CharSequence)localObject2);
      label255: if (!bo.isNullOrNil(((aa.a)localObject1).tag))
        break label337;
      paramViewGroup.ngo.setVisibility(8);
      label275: if (bo.isNullOrNil(((aa.a)localObject1).mXS))
        break label360;
      paramViewGroup.ngp.setText(((aa.a)localObject1).mXS);
      paramViewGroup.ngq.setVisibility(8);
    }
    while (true)
    {
      AppMethodBeat.o(111815);
      return paramView;
      paramViewGroup = (i.a)paramView.getTag();
      break;
      label325: paramViewGroup.ngn.setText("");
      break label255;
      label337: paramViewGroup.ngo.setVisibility(0);
      paramViewGroup.ngo.setText(((aa.a)localObject1).tag);
      break label275;
      label360: paramViewGroup.ngp.setText(((aa.a)localObject1).mEA);
      localObject2 = paramViewGroup.ngq;
      localObject1 = this.ngk;
      ((GameDetailRankLikeView)localObject2).ngr = ((aa)localObject1);
      ((GameDetailRankLikeView)localObject2).mAppId = ((aa)localObject1).mAppId;
      ((GameDetailRankLikeView)localObject2).ngs = ((aa.a)((aa)localObject1).mXO.get(paramInt));
      ((GameDetailRankLikeView)localObject2).resetState();
      paramViewGroup.ngq.setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.i
 * JD-Core Version:    0.6.2
 */