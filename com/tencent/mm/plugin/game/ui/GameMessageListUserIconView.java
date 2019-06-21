package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.e.a.a;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.model.n.i;
import com.tencent.mm.plugin.game.model.o;
import com.tencent.mm.plugin.game.model.o.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class GameMessageListUserIconView extends LinearLayout
{
  private Context mContext;
  private o nkO;
  private f<String, Bitmap> nkP;

  public GameMessageListUserIconView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(112091);
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(112091);
  }

  public GameMessageListUserIconView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112092);
    this.mContext = paramContext;
    init();
    AppMethodBeat.o(112092);
  }

  private void e(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(112098);
    paramImageView = e.bFH().j(paramImageView, paramString);
    if (paramImageView != null)
      this.nkP.put(paramString, paramImageView);
    AppMethodBeat.o(112098);
  }

  private void g(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(112097);
    e.a.a locala = new e.a.a();
    locala.ePF = false;
    e.bFH().a(paramImageView, paramString, locala.bFI(), new GameMessageListUserIconView.1(this, paramString));
    AppMethodBeat.o(112097);
  }

  private void init()
  {
    AppMethodBeat.i(112094);
    if (this.nkO == null)
      this.nkO = new o(this.mContext);
    AppMethodBeat.o(112094);
  }

  public final void a(n paramn, LinkedList<n.i> paramLinkedList, f<String, Bitmap> paramf)
  {
    AppMethodBeat.i(112096);
    if ((paramn == null) || (bo.ek(paramLinkedList)))
    {
      setVisibility(8);
      AppMethodBeat.o(112096);
    }
    while (true)
    {
      return;
      this.nkP = paramf;
      setVisibility(0);
      int i = this.mContext.getResources().getDimensionPixelSize(2131427756);
      int j = this.mContext.getResources().getDimensionPixelSize(2131427500);
      Object localObject1 = new LinearLayout.LayoutParams(i, i);
      ((LinearLayout.LayoutParams)localObject1).rightMargin = j;
      while (getChildCount() < paramLinkedList.size())
      {
        paramf = new ImageView(this.mContext);
        paramf.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        paramf.setScaleType(ImageView.ScaleType.FIT_XY);
        paramf.setOnClickListener(this.nkO);
        addView(paramf);
      }
      j = 0;
      if (j < getChildCount())
      {
        paramf = (ImageView)getChildAt(j);
        Object localObject2;
        Object localObject3;
        if (j < paramLinkedList.size())
        {
          paramf.setVisibility(0);
          localObject1 = (n.i)paramLinkedList.get(j);
          if (!bo.isNullOrNil(((n.i)localObject1).mXu))
          {
            localObject2 = ((n.i)localObject1).mXu;
            if (this.nkP.aj(localObject2))
            {
              localObject3 = (Bitmap)this.nkP.get(localObject2);
              if ((localObject3 == null) || (((Bitmap)localObject3).isRecycled()))
              {
                g(paramf, (String)localObject2);
                label253: if (bo.isNullOrNil(((n.i)localObject1).mXx))
                  break label409;
                paramf.setTag(new o.a(paramn, ((n.i)localObject1).mXx, 6));
                paramf.setEnabled(true);
              }
            }
          }
        }
        while (true)
        {
          j++;
          break;
          paramf.setImageBitmap((Bitmap)localObject3);
          break label253;
          g(paramf, (String)localObject2);
          break label253;
          localObject3 = ((n.i)localObject1).userName;
          if (bo.isNullOrNil((String)localObject3))
          {
            a.b.b(paramf, (String)localObject3);
            break label253;
          }
          if (!this.nkP.aj(localObject3))
          {
            e(paramf, (String)localObject3);
            break label253;
          }
          localObject2 = (Bitmap)this.nkP.get(localObject3);
          if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled()))
          {
            e(paramf, (String)localObject3);
            break label253;
          }
          paramf.setImageBitmap((Bitmap)localObject2);
          break label253;
          label409: paramf.setEnabled(false);
          continue;
          paramf.setVisibility(8);
        }
      }
      AppMethodBeat.o(112096);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(112093);
    super.onFinishInflate();
    init();
    AppMethodBeat.o(112093);
  }

  public void setSourceScene(int paramInt)
  {
    AppMethodBeat.i(112095);
    if (this.nkO != null)
    {
      this.nkO.mXC = paramInt;
      AppMethodBeat.o(112095);
    }
    while (true)
    {
      return;
      this.nkO = new o(this.mContext, paramInt);
      AppMethodBeat.o(112095);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameMessageListUserIconView
 * JD-Core Version:    0.6.2
 */