package com.tencent.mm.plugin.appbrand.widget.desktop.half;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.c;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.RecyclerView.v;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.c;
import com.tencent.mm.plugin.appbrand.widget.desktop.d;
import com.tencent.mm.plugin.appbrand.widget.header.a.a.b;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.a;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.b;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.c;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.d;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.e;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.f;
import com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView;
import com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.c;
import com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView;
import com.tencent.mm.plugin.appbrand.widget.recentview.b;
import com.tencent.mm.plugin.appbrand.widget.recentview.e;
import com.tencent.mm.plugin.appbrand.widget.recentview.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.List;

public class AppBrandDesktopHalfItemView extends LinearLayout
{
  private RecyclerView.m anZ;
  private int iWJ;
  ConversationAppBrandRecentView iWW;
  private int iYI;
  private int ivr;
  boolean jaA;
  private a.b jaB;
  private boolean jaC;
  private Animator.AnimatorListener jaD;
  private TextView jao;
  private ImageView jap;
  private AppBrandRecentView.e jaq;
  RecyclerView.c jar;
  private AppBrandRecentView.b jas;
  private b jat;
  private LinearLayout jau;
  private FrameLayout jav;
  private View jaw;
  private AppBrandRecentView.f jax;
  private float jay;
  AppBrandDesktopHalfItemView.a jaz;
  private Context mContext;

  public AppBrandDesktopHalfItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(134139);
    this.jaq = null;
    this.jar = null;
    this.jas = null;
    this.anZ = null;
    this.jat = null;
    this.jau = null;
    this.jav = null;
    this.jaw = null;
    this.iWJ = 0;
    this.iYI = 0;
    this.jay = 0.0F;
    this.jaz = null;
    this.jaA = false;
    this.jaB = null;
    this.jaC = true;
    this.ivr = 1;
    this.jaD = new AppBrandDesktopHalfItemView.2(this);
    init(paramContext);
    AppMethodBeat.o(134139);
  }

  public AppBrandDesktopHalfItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(134140);
    this.jaq = null;
    this.jar = null;
    this.jas = null;
    this.anZ = null;
    this.jat = null;
    this.jau = null;
    this.jav = null;
    this.jaw = null;
    this.iWJ = 0;
    this.iYI = 0;
    this.jay = 0.0F;
    this.jaz = null;
    this.jaA = false;
    this.jaB = null;
    this.jaC = true;
    this.ivr = 1;
    this.jaD = new AppBrandDesktopHalfItemView.2(this);
    init(paramContext);
    AppMethodBeat.o(134140);
  }

  private void aQa()
  {
    AppMethodBeat.i(134144);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(getContext().getResources().getDisplayMetrics().widthPixels * 2, -2);
    this.jau.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(134144);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(134141);
    this.mContext = paramContext;
    paramContext = v.hu(this.mContext).inflate(2130968672, this);
    this.jao = ((TextView)paramContext.findViewById(2131821158));
    this.jao.setOnClickListener(new AppBrandDesktopHalfItemView.5(this));
    this.jap = ((ImageView)paramContext.findViewById(2131821159));
    this.jap.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(134130);
        if (AppBrandDesktopHalfItemView.a(AppBrandDesktopHalfItemView.this) == AppBrandRecentView.f.jmI)
        {
          ((com.tencent.mm.plugin.appbrand.service.g)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.g.class)).cB(AppBrandDesktopHalfItemView.this.getContext());
          if (AppBrandDesktopHalfItemView.b(AppBrandDesktopHalfItemView.this) == null)
            break label122;
          AppBrandDesktopHalfItemView.b(AppBrandDesktopHalfItemView.this).aQg();
          AppMethodBeat.o(134130);
        }
        while (true)
        {
          return;
          if (AppBrandDesktopHalfItemView.a(AppBrandDesktopHalfItemView.this) == AppBrandRecentView.f.jmH)
          {
            ((com.tencent.mm.plugin.appbrand.service.g)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.g.class)).C(AppBrandDesktopHalfItemView.this.getContext(), 3);
            if (AppBrandDesktopHalfItemView.b(AppBrandDesktopHalfItemView.this) != null)
              AppBrandDesktopHalfItemView.b(AppBrandDesktopHalfItemView.this).aQh();
          }
          label122: AppMethodBeat.o(134130);
        }
      }
    });
    this.jav = ((FrameLayout)paramContext.findViewById(2131821160));
    this.jau = ((LinearLayout)paramContext.findViewById(2131821161));
    aQa();
    this.iWW = ((ConversationAppBrandRecentView)paramContext.findViewById(2131821162));
    this.iWW.setRefreshListener(new AppBrandDesktopHalfItemView.7(this));
    this.iWW.getAdapter().a(new AppBrandDesktopHalfItemView.8(this));
    this.iWW.setOnItemClickListener(new AppBrandDesktopHalfItemView.9(this));
    this.iWW.setOnScrollPageListener(new AppBrandDesktopHalfItemView.10(this));
    this.iWW.setOnBindCustomViewHolderListener(new AppBrandDesktopHalfItemView.11(this));
    AppMethodBeat.o(134141);
  }

  private void setToDefaultStatus(RecyclerView.v paramv)
  {
    AppMethodBeat.i(134145);
    if ((paramv instanceof BaseAppBrandRecentView.c))
    {
      paramv.apJ.setAlpha(0.0F);
      paramv.apJ.setScaleX(0.95F);
      paramv.apJ.setScaleY(0.95F);
    }
    AppMethodBeat.o(134145);
  }

  public final void a(Configuration paramConfiguration)
  {
    AppMethodBeat.i(134143);
    ab.i("MicroMsg.AppBrandDesktopHalfItemView", "alvinluo HalfItemView onConfigurationChanged orientation: %d", new Object[] { Integer.valueOf(paramConfiguration.orientation) });
    if (this.ivr != paramConfiguration.orientation)
    {
      Object localObject = this.iWW;
      int i = ((RecyclerView)localObject).getItemDecorationCount();
      if (i <= 0)
      {
        paramConfiguration = new IndexOutOfBoundsException("0 is an invalid index for size ".concat(String.valueOf(i)));
        AppMethodBeat.o(134143);
        throw paramConfiguration;
      }
      localObject = (RecyclerView.h)((RecyclerView)localObject).anm.get(0);
      if ((localObject != null) && ((localObject instanceof a)))
        ((a)localObject).padding = d.dj(this.mContext);
      this.iWW.getAdapter().aop.notifyChanged();
    }
    this.ivr = paramConfiguration.orientation;
    AppMethodBeat.o(134143);
  }

  public final void a(AppBrandRecentView.f paramf)
  {
    AppMethodBeat.i(134138);
    this.jax = paramf;
    if (this.jax == AppBrandRecentView.f.jmH)
    {
      this.jao.setText(getResources().getString(2131302184));
      this.iWW.setType(this.jax);
      this.iWW.setItemAnimator(new c(this.iWW, true));
      this.iWW.setDataQuery(new AppBrandDesktopHalfItemView.1(this));
      AppMethodBeat.o(134138);
    }
    while (true)
    {
      return;
      if (this.jax == AppBrandRecentView.f.jmI)
      {
        setTitle(getResources().getString(2131301602));
        this.iWW.setType(this.jax);
        this.iWW.setItemAnimator(new c(this.iWW, false));
        this.iWW.setDataQuery(new AppBrandDesktopHalfItemView.4(this));
      }
      AppMethodBeat.o(134138);
    }
  }

  public final void a(e.b paramb)
  {
    AppMethodBeat.i(134158);
    Object localObject = this.iWW;
    if (((BaseAppBrandRecentView)localObject).jnB != null)
    {
      localObject = ((BaseAppBrandRecentView)localObject).jnB;
      ((e)localObject).joq = true;
      ((e)localObject).a(0, paramb, true);
    }
    AppMethodBeat.o(134158);
  }

  public final void aQb()
  {
    AppMethodBeat.i(134159);
    Object localObject = this.iWW;
    if (((BaseAppBrandRecentView)localObject).jnB != null)
    {
      localObject = ((BaseAppBrandRecentView)localObject).jnB;
      ((e)localObject).joi.getLayoutManager().bY(0);
      ((e)localObject).mOffsetX = 0;
      ((e)localObject).joj = 0;
      ((e)localObject).jok = 0;
      ((e)localObject).jiy = 0;
    }
    AppMethodBeat.o(134159);
  }

  public int getCustomCount()
  {
    AppMethodBeat.i(134154);
    int i = this.iWW.getCustomItemCount();
    AppMethodBeat.o(134154);
    return i;
  }

  public int getDataCount()
  {
    AppMethodBeat.i(134153);
    int i = this.iWW.getDataCount();
    AppMethodBeat.o(134153);
    return i;
  }

  public List<com.tencent.mm.plugin.appbrand.widget.recentview.a> getPreviewList()
  {
    AppMethodBeat.i(134152);
    List localList = this.iWW.getPreviewItemList();
    AppMethodBeat.o(134152);
    return localList;
  }

  public ConversationAppBrandRecentView getRecentView()
  {
    return this.iWW;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134142);
    super.onMeasure(paramInt1, paramInt2);
    if ((this.jaC) && (this.jap.getMeasuredWidth() != 0) && (this.jap.getMeasuredHeight() != 0))
    {
      this.jap.getLayoutParams().width = ((int)(this.jap.getMeasuredWidth() * d.dm(getContext())));
      this.jap.getLayoutParams().height = ((int)(this.jap.getMeasuredHeight() * d.dm(getContext())));
      this.jaC = false;
    }
    AppMethodBeat.o(134142);
  }

  public void setCreateContextMenuListener(View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
    AppMethodBeat.i(134155);
    this.iWW.setCreateContextMenuListener(paramOnCreateContextMenuListener);
    AppMethodBeat.o(134155);
  }

  public void setDataQuery(AppBrandRecentView.c paramc)
  {
    AppMethodBeat.i(134151);
    this.iWW.setDataQuery(paramc);
    AppMethodBeat.o(134151);
  }

  public void setEnableDataCache(boolean paramBoolean)
  {
    AppMethodBeat.i(134147);
    this.iWW.setEnableDataCache(paramBoolean);
    AppMethodBeat.o(134147);
  }

  public void setItemPadding(int paramInt)
  {
    this.iWJ = paramInt;
  }

  public void setMenuItemSelectedListener(AppBrandRecentView.a parama)
  {
    AppMethodBeat.i(134156);
    this.iWW.setMenuItemSelectedListener(parama);
    AppMethodBeat.o(134156);
  }

  public void setOnDataChangedListener(AppBrandRecentView.d paramd)
  {
    AppMethodBeat.i(134157);
    this.iWW.setOnDataChangedListener(paramd);
    AppMethodBeat.o(134157);
  }

  public void setOnItemClickListener(AppBrandRecentView.b paramb)
  {
    this.jas = paramb;
  }

  public void setOnLaunchUIListener(a.b paramb)
  {
    this.jaB = paramb;
  }

  public void setRefreshListener(AppBrandRecentView.e parame)
  {
    AppMethodBeat.i(134146);
    this.iWW.setRefreshListener(parame);
    AppMethodBeat.o(134146);
  }

  public void setReporter(b paramb)
  {
    this.jat = paramb;
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(134148);
    this.jao.setText(paramString);
    AppMethodBeat.o(134148);
  }

  public void setTitlePadding(Rect paramRect)
  {
    AppMethodBeat.i(134150);
    if (paramRect != null)
      this.jao.setPadding(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
    AppMethodBeat.o(134150);
  }

  public void setTitlePaddingLeft(int paramInt)
  {
    AppMethodBeat.i(134149);
    if (this.jao != null)
    {
      TextView localTextView = this.jao;
      localTextView.setPadding(paramInt, localTextView.getPaddingTop(), this.jao.getPaddingRight(), this.jao.getPaddingBottom());
    }
    AppMethodBeat.o(134149);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.half.AppBrandDesktopHalfItemView
 * JD-Core Version:    0.6.2
 */