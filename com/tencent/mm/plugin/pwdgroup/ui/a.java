package com.tencent.mm.plugin.pwdgroup.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.pwdgroup.b.a;
import com.tencent.mm.protocal.protobuf.aan;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.LinkedList;

public final class a extends BaseAdapter
{
  private LinkedList<aan> lei;
  private Context mContext;
  private Animation nCY;
  private Animation prN;
  private Animation prO;
  private HashMap<String, Boolean> prP;

  public a(Context paramContext)
  {
    AppMethodBeat.i(24033);
    this.lei = new LinkedList();
    this.prP = new HashMap();
    this.mContext = paramContext;
    this.nCY = AnimationUtils.loadAnimation(this.mContext, 2131034125);
    this.prO = AnimationUtils.loadAnimation(this.mContext, 2131034125);
    this.prN = AnimationUtils.loadAnimation(this.mContext, 2131034126);
    this.nCY.setInterpolator(new AccelerateDecelerateInterpolator());
    this.prO.setInterpolator(new AccelerateInterpolator());
    this.prN.setInterpolator(new AccelerateDecelerateInterpolator());
    this.nCY.setDuration(300L);
    this.prO.setDuration(1000L);
    this.prN.setDuration(1000L);
    AppMethodBeat.o(24033);
  }

  private static String a(aan paramaan)
  {
    AppMethodBeat.i(24038);
    if (paramaan == null)
    {
      paramaan = "";
      AppMethodBeat.o(24038);
    }
    while (true)
    {
      return paramaan;
      if (bo.isNullOrNil(paramaan.jBB))
      {
        paramaan = paramaan.wfK;
        AppMethodBeat.o(24038);
      }
      else
      {
        paramaan = paramaan.jBB;
        AppMethodBeat.o(24038);
      }
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(24035);
    int i;
    if (this.lei == null)
    {
      i = 1;
      AppMethodBeat.o(24035);
    }
    while (true)
    {
      return i;
      i = this.lei.size() + 1;
      AppMethodBeat.o(24035);
    }
  }

  public final Object getItem(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(24036);
    if (this.lei == null)
      AppMethodBeat.o(24036);
    while (true)
    {
      return localObject;
      if (paramInt >= this.lei.size())
      {
        AppMethodBeat.o(24036);
      }
      else
      {
        localObject = this.lei.get(paramInt);
        AppMethodBeat.o(24036);
      }
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, final View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(24037);
    Object localObject;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.mContext).inflate(2130969490, null);
      paramViewGroup = new a.a(this, paramView);
      paramView.setTag(paramViewGroup);
      localObject = (aan)getItem(paramInt);
      if (localObject != null)
      {
        if (!bo.isNullOrNil(((aan)localObject).jCH))
          break label260;
        paramViewGroup.gsf.setText(((aan)localObject).jBB);
        label84: if (bo.isNullOrNil(((aan)localObject).jBB))
          break label275;
        b.a.b(paramViewGroup.iNr, ((aan)localObject).jBB);
      }
    }
    while (true)
    {
      localObject = a((aan)localObject);
      paramView.clearAnimation();
      if ((this.prP.containsKey(localObject)) && (!((Boolean)this.prP.get(localObject)).booleanValue()))
      {
        paramView.startAnimation(this.nCY);
        this.prP.put(localObject, Boolean.TRUE);
      }
      if (paramInt + 1 == getCount())
      {
        paramViewGroup.gsf.setText("");
        paramViewGroup.iNr.setImageResource(2130837610);
        if (paramView != null)
        {
          this.prO.setAnimationListener(new a.1(this, paramView));
          this.prN.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              AppMethodBeat.i(24031);
              paramView.startAnimation(a.b(a.this));
              AppMethodBeat.o(24031);
            }

            public final void onAnimationRepeat(Animation paramAnonymousAnimation)
            {
            }

            public final void onAnimationStart(Animation paramAnonymousAnimation)
            {
            }
          });
          paramView.startAnimation(this.prO);
        }
      }
      AppMethodBeat.o(24037);
      return paramView;
      paramViewGroup = (a.a)paramView.getTag();
      break;
      label260: paramViewGroup.gsf.setText(((aan)localObject).jCH);
      break label84;
      label275: b.a.b(paramViewGroup.iNr, ((aan)localObject).wfK);
    }
  }

  public final void setData(LinkedList<aan> paramLinkedList)
  {
    AppMethodBeat.i(24034);
    this.lei = paramLinkedList;
    if ((this.lei != null) && (this.lei.size() > 0))
    {
      int i = this.lei.size();
      for (int j = 0; j < i; j++)
      {
        paramLinkedList = a((aan)this.lei.get(j));
        if (!this.prP.containsKey(paramLinkedList))
          this.prP.put(paramLinkedList, Boolean.FALSE);
      }
    }
    notifyDataSetChanged();
    AppMethodBeat.o(24034);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.ui.a
 * JD-Core Version:    0.6.2
 */