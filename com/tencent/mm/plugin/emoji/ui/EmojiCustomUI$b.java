package com.tencent.mm.plugin.emoji.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

final class EmojiCustomUI$b extends BaseAdapter
{
  private int ezx;
  private ArrayList<EmojiInfo> kWs;
  private Animation kZV;

  public EmojiCustomUI$b(EmojiCustomUI paramEmojiCustomUI, int paramInt)
  {
    AppMethodBeat.i(53322);
    this.ezx = paramInt;
    this.kZV = AnimationUtils.loadAnimation(paramEmojiCustomUI, 2131034242);
    paramEmojiCustomUI = new LinearInterpolator();
    this.kZV.setInterpolator(paramEmojiCustomUI);
    AppMethodBeat.o(53322);
  }

  private static void a(ImageView paramImageView, EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(53329);
    com.tencent.mm.emoji.loader.a locala = com.tencent.mm.emoji.loader.a.exs;
    com.tencent.mm.emoji.loader.a.a(paramEmojiInfo, paramImageView);
    AppMethodBeat.o(53329);
  }

  private int blx()
  {
    AppMethodBeat.i(53324);
    int i;
    if ((getRealCount() > 0) && ((getRealCount() + 1) % 5 == 0))
    {
      i = 1;
      AppMethodBeat.o(53324);
    }
    while (true)
    {
      return i;
      i = 2;
      AppMethodBeat.o(53324);
    }
  }

  public final boolean bly()
  {
    AppMethodBeat.i(53328);
    int i;
    if (g.RP().isSDCardAvailable())
      if (this.ezx == 0)
      {
        this.kWs = ((ArrayList)j.getEmojiStorageMgr().xYn.ps(false));
        if (EmojiCustomUI.m(this.kZL) != EmojiCustomUI.c.kZX)
          break label139;
        if (EmojiCustomUI.n(this.kZL) != null)
          break label125;
        i = 0;
        label63: this.kZL.setMMTitle(this.kZL.getString(2131299080, new Object[] { Integer.valueOf(i) }));
      }
    while (true)
    {
      AppMethodBeat.o(53328);
      return true;
      this.kWs = com.tencent.mm.emoji.a.a.OB().bZ(false);
      break;
      this.kWs = new ArrayList();
      break;
      label125: i = EmojiCustomUI.n(this.kZL).size();
      break label63;
      label139: if (this.ezx == 0)
        this.kZL.setMMTitle(this.kZL.getString(2131299044, new Object[] { Integer.valueOf(this.kWs.size()) }));
      else
        this.kZL.setMMTitle(this.kZL.getString(2131299027, new Object[] { Integer.valueOf(this.kWs.size()) }));
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(53323);
    int i = getRealCount();
    int j = blx();
    AppMethodBeat.o(53323);
    return i + j;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getRealCount()
  {
    AppMethodBeat.i(53325);
    int i;
    if (this.kWs == null)
    {
      i = 0;
      AppMethodBeat.o(53325);
    }
    while (true)
    {
      return i;
      i = this.kWs.size();
      AppMethodBeat.o(53325);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(53327);
    label55: int i;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.kZL.mController.ylL).inflate(2130969333, null);
      paramView.setVisibility(0);
      paramViewGroup = new EmojiCustomUI.d(paramView);
      paramView.setTag(paramViewGroup);
      if ((EmojiCustomUI.m(this.kZL) != EmojiCustomUI.c.kZZ) && (EmojiCustomUI.m(this.kZL) != EmojiCustomUI.c.kZX))
        break label199;
      i = blx();
      label87: if (paramInt >= getCount() - i)
        break label239;
      if (paramInt % 5 != 0)
        break label227;
      paramViewGroup.iym.setBackgroundResource(2130838565);
    }
    while (true)
    {
      paramViewGroup.image.clearAnimation();
      paramViewGroup.image.setScaleType(ImageView.ScaleType.FIT_CENTER);
      switch (EmojiCustomUI.11.kZQ[EmojiCustomUI.m(this.kZL).ordinal()])
      {
      default:
        AppMethodBeat.o(53327);
        return paramView;
        paramView.setVisibility(0);
        paramViewGroup = (EmojiCustomUI.d)paramView.getTag();
        break label55;
        label199: if (1 == this.ezx)
        {
          i = blx();
          break label87;
        }
        i = blx() - 1;
        break label87;
        label227: paramViewGroup.iym.setBackgroundResource(2130838570);
        continue;
        label239: if (paramInt == getCount() - i)
          paramViewGroup.iym.setBackgroundResource(2130838569);
        else
          paramViewGroup.iym.setBackgroundColor(0);
        break;
      case 1:
      case 3:
      case 2:
      case 4:
      }
    }
    Object localObject;
    if (paramInt == getCount() - blx() + 1)
    {
      localObject = com.tencent.mm.emoji.loader.a.exs;
      com.tencent.mm.emoji.loader.a.cf(paramViewGroup.image);
      paramViewGroup.image.setImageBitmap(null);
    }
    while (true)
    {
      paramViewGroup.lab.setVisibility(8);
      break;
      if (paramInt == 0)
      {
        if (this.ezx == 0)
        {
          localObject = com.tencent.mm.emoji.loader.a.exs;
          com.tencent.mm.emoji.loader.a.cf(paramViewGroup.image);
          paramViewGroup.image.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
          paramViewGroup.image.setImageResource(2131231221);
        }
        else if (paramInt != getRealCount())
        {
          localObject = (EmojiInfo)this.kWs.get(paramInt);
          a(paramViewGroup.image, (EmojiInfo)localObject);
        }
      }
      else if (this.ezx == 0)
      {
        localObject = (EmojiInfo)this.kWs.get(paramInt - 1);
        a(paramViewGroup.image, (EmojiInfo)localObject);
      }
      else if (paramInt != getRealCount())
      {
        localObject = (EmojiInfo)this.kWs.get(paramInt);
        a(paramViewGroup.image, (EmojiInfo)localObject);
      }
      else
      {
        localObject = com.tencent.mm.emoji.loader.a.exs;
        com.tencent.mm.emoji.loader.a.cf(paramViewGroup.image);
        paramViewGroup.image.setImageBitmap(null);
      }
    }
    if (paramInt == getCount() - blx() + 1)
    {
      localObject = com.tencent.mm.emoji.loader.a.exs;
      com.tencent.mm.emoji.loader.a.cf(paramViewGroup.image);
      paramViewGroup.image.setImageBitmap(null);
    }
    while (true)
    {
      paramViewGroup.lab.setVisibility(8);
      break;
      if (paramInt == getRealCount())
      {
        localObject = com.tencent.mm.emoji.loader.a.exs;
        com.tencent.mm.emoji.loader.a.cf(paramViewGroup.image);
        paramViewGroup.image.setImageResource(2130839884);
        paramViewGroup.image.startAnimation(this.kZV);
      }
      else
      {
        localObject = (EmojiInfo)this.kWs.get(paramInt);
        a(paramViewGroup.image, (EmojiInfo)localObject);
      }
    }
    if (paramInt == getCount() - blx() + 1)
    {
      localObject = com.tencent.mm.emoji.loader.a.exs;
      com.tencent.mm.emoji.loader.a.cf(paramViewGroup.image);
      paramViewGroup.image.setImageBitmap(null);
    }
    while (true)
    {
      paramViewGroup.lab.setVisibility(8);
      break;
      if (paramInt == getRealCount())
      {
        localObject = com.tencent.mm.emoji.loader.a.exs;
        com.tencent.mm.emoji.loader.a.cf(paramViewGroup.image);
        paramViewGroup.image.setImageBitmap(null);
      }
      else
      {
        localObject = (EmojiInfo)this.kWs.get(paramInt);
        a(paramViewGroup.image, (EmojiInfo)localObject);
        if (((EmojiInfo)localObject).field_catalog != EmojiGroupInfo.yad)
        {
          paramViewGroup.lab.setVisibility(0);
          paramViewGroup.lab.setChecked(EmojiCustomUI.n(this.kZL).contains(((EmojiInfo)localObject).Aq()));
          break;
          if (paramInt == getCount() - blx() + 1)
          {
            localObject = com.tencent.mm.emoji.loader.a.exs;
            com.tencent.mm.emoji.loader.a.cf(paramViewGroup.image);
            paramViewGroup.image.setImageBitmap(null);
          }
          else if (paramInt == getRealCount())
          {
            localObject = com.tencent.mm.emoji.loader.a.exs;
            com.tencent.mm.emoji.loader.a.cf(paramViewGroup.image);
            paramViewGroup.image.setImageBitmap(null);
          }
          else
          {
            localObject = (EmojiInfo)this.kWs.get(paramInt);
            a(paramViewGroup.image, (EmojiInfo)localObject);
          }
        }
      }
    }
  }

  public final EmojiInfo uf(int paramInt)
  {
    EmojiInfo localEmojiInfo = null;
    AppMethodBeat.i(53326);
    if (paramInt >= getRealCount())
      AppMethodBeat.o(53326);
    while (true)
    {
      return localEmojiInfo;
      if (this.kWs == null)
      {
        AppMethodBeat.o(53326);
      }
      else
      {
        localEmojiInfo = (EmojiInfo)this.kWs.get(paramInt);
        AppMethodBeat.o(53326);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.b
 * JD-Core Version:    0.6.2
 */