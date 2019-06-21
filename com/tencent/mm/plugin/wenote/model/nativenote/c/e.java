package com.tencent.mm.plugin.wenote.model.nativenote.c;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collections;

public final class e
  implements a.a
{
  public static boolean mHasInit = false;
  public static volatile e uRg = null;
  public ak mHandler = null;
  public int mScreenHeight = 0;
  public int mScreenWidth = 0;
  public com.tencent.mm.plugin.wenote.model.nativenote.b.a uRA = null;
  public d uRB = null;
  public b uRC = null;
  public ap uRD = null;
  public ap uRE = null;
  public TextView uRF = null;
  public TextView uRG = null;
  public TextView uRH = null;
  public TextView uRI = null;
  public TextView uRJ = null;
  public TextView uRK = null;
  public TextView uRL = null;
  public TextView uRM = null;
  public boolean uRh = true;
  public int uRi = 0;
  public int uRj = 0;
  public int uRk = 14;
  public int uRl = 0;
  public int uRm = 0;
  public int uRn = 0;
  public int uRo = 0;
  public int uRp = 0;
  public int uRq = 0;
  public int uRr = 0;
  public int[] uRs = null;
  public int[] uRt = null;
  public int[] uRu = null;
  public int[] uRv = null;
  public PopupWindow uRw = null;
  public PopupWindow uRx = null;
  public PopupWindow uRy = null;
  public PopupWindow uRz = null;

  private e()
  {
    mHasInit = false;
  }

  private boolean Ki(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(26889);
    if ((this.uRC != null) && (this.uRC.klY == paramInt) && (this.uRC.getType() == 1))
    {
      AppMethodBeat.o(26889);
      bool2 = bool1;
      return bool2;
    }
    if ((paramInt == 2) && (this.uRw != null))
    {
      this.uRw.dismiss();
      aq(2, -1, -1);
    }
    while (true)
    {
      AppMethodBeat.o(26889);
      break;
      if ((paramInt == 3) && (this.uRx != null))
      {
        this.uRx.dismiss();
        aq(3, -1, -1);
      }
      else if ((paramInt == 4) && (this.uRy != null))
      {
        this.uRy.dismiss();
        aq(4, -1, -1);
      }
      else
      {
        bool2 = false;
      }
    }
  }

  private static SpannableStringBuilder a(i parami, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3)
  {
    SpannableStringBuilder localSpannableStringBuilder = null;
    AppMethodBeat.i(26907);
    if (parami == null)
    {
      ab.e("NoteSelectManager", "processTextDataItem: textDataItem is null");
      AppMethodBeat.o(26907);
    }
    Object localObject;
    for (parami = localSpannableStringBuilder; ; parami = localSpannableStringBuilder)
    {
      return parami;
      localObject = com.tencent.mm.plugin.wenote.model.nativenote.a.a.ahb(parami.content);
      if (localObject != null)
        break;
      ab.e("NoteSelectManager", "processTextDataItem: spannedText is null");
      AppMethodBeat.o(26907);
    }
    if (paramBoolean1)
      paramInt2 = ((Spanned)localObject).length();
    while (true)
    {
      String str = paramString;
      if (paramString == null)
        str = "";
      if ((paramInt1 < 0) || (paramInt1 > ((Spanned)localObject).length()) || (paramInt2 < 0) || (paramInt2 > ((Spanned)localObject).length()) || (paramInt1 > paramInt2))
      {
        ab.e("NoteSelectManager", "processTextDataItem: incorrect offset");
        AppMethodBeat.o(26907);
        parami = localSpannableStringBuilder;
        break;
      }
      localSpannableStringBuilder = (SpannableStringBuilder)((Spanned)localObject).subSequence(0, paramInt1);
      paramString = (SpannableStringBuilder)((Spanned)localObject).subSequence(paramInt1, paramInt2);
      localObject = (SpannableStringBuilder)((Spanned)localObject).subSequence(paramInt2, ((Spanned)localObject).length());
      paramInt1 = paramInt2;
      if (paramBoolean2)
      {
        paramInt2 = localSpannableStringBuilder.length();
        paramInt1 = paramInt2;
        if (!bo.isNullOrNil(str))
        {
          Spanned localSpanned = com.tencent.mm.plugin.wenote.model.nativenote.a.a.ahb(str);
          paramInt1 = paramInt2;
          if (localSpanned != null)
            paramInt1 = paramInt2 + localSpanned.length();
        }
        parami.content = (com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(localSpannableStringBuilder) + str + com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)localObject));
      }
      if (paramBoolean3)
        parami.uNT = true;
      for (parami.uNV = paramInt1; ; parami.uNV = -1)
      {
        AppMethodBeat.o(26907);
        parami = paramString;
        break;
        parami.uNT = false;
      }
    }
  }

  private SpannableStringBuilder a(boolean paramBoolean, ArrayList<com.tencent.mm.plugin.wenote.model.a.c> paramArrayList, String paramString)
  {
    SpannableStringBuilder localSpannableStringBuilder = null;
    int i = 2;
    AppMethodBeat.i(26905);
    d locald = dfd();
    dff();
    int j = locald.dfa();
    if ((j != 1) && (j != 2))
    {
      ab.e("NoteSelectManager", "getAndProcessSelectedDataInSingleSelect: incorrect select");
      AppMethodBeat.o(26905);
    }
    Object localObject;
    for (paramArrayList = localSpannableStringBuilder; ; paramArrayList = localSpannableStringBuilder)
    {
      return paramArrayList;
      localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(locald.coc);
      if (localObject != null)
        break;
      ab.e("NoteSelectManager", "getAndProcessSelectedDataInSingleSelect: item is null");
      AppMethodBeat.o(26905);
    }
    localSpannableStringBuilder = new SpannableStringBuilder();
    if (((com.tencent.mm.plugin.wenote.model.a.c)localObject).getType() == 1)
    {
      if ((paramBoolean) && (paramArrayList != null) && (paramArrayList.size() > 0))
      {
        paramString = a((i)localObject, locald.startOffset, locald.uRf, false, false, "", true);
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(paramArrayList, 0, locald.coc, locald.startOffset, locald.uRf);
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().gG(locald.coc, locald.coc + paramArrayList.size() + 1);
        paramArrayList = paramString;
      }
      while (true)
      {
        label204: AppMethodBeat.o(26905);
        break;
        paramString = a((i)localObject, locald.startOffset, locald.uRf, false, paramBoolean, paramString, true);
        if (this.uRA != null)
          this.uRA.JX(locald.coc);
        paramArrayList = paramString;
        if (paramBoolean)
        {
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().dew();
          paramArrayList = paramString;
        }
      }
    }
    if ((j == 1) && (paramBoolean))
    {
      if (locald.startOffset == 0)
        i = 1;
      if ((paramArrayList != null) && (paramArrayList.size() > 0))
        break label433;
      if (bo.isNullOrNil(paramString))
        break label421;
      paramArrayList = new ArrayList();
      localObject = new i();
      ((i)localObject).content = paramString;
      ((i)localObject).uNT = false;
      ((i)localObject).uNV = -1;
      paramArrayList.add(localObject);
    }
    label421: label433: 
    while (true)
    {
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(paramArrayList, i, locald.coc, locald.startOffset, locald.uRf);
      paramString = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem();
      j = locald.coc;
      i = locald.coc;
      paramString.gG(j - 1, paramArrayList.size() + i + 1);
      paramArrayList = localSpannableStringBuilder;
      break label204;
      AppMethodBeat.o(26905);
      paramArrayList = localSpannableStringBuilder;
      break;
    }
  }

  private void a(int paramInt1, RecyclerView paramRecyclerView, View paramView, int paramInt2)
  {
    AppMethodBeat.i(26891);
    if ((!mHasInit) || (paramRecyclerView == null))
      AppMethodBeat.o(26891);
    while (true)
    {
      return;
      paramView = f.er(paramView);
      if (paramView != null)
        break;
      Ki(paramInt1);
      AppMethodBeat.o(26891);
    }
    if (paramView.uRc != null)
      paramView = paramView.uRc;
    while (true)
    {
      if (paramView == null)
      {
        Ki(paramInt1);
        AppMethodBeat.o(26891);
        break;
        if ((paramView.uRd == null) || (paramView.uRe == null))
          break label487;
        if (paramInt2 == 0)
        {
          paramView = paramView.uRd;
          paramInt2 = 0;
          continue;
        }
        if (paramInt2 != 1)
          break label487;
        paramView = paramView.uRe;
        paramInt2 = 0;
        continue;
      }
      Object localObject = paramView.getText();
      if ((localObject == null) || (paramInt2 < 0) || (paramInt2 > ((Editable)localObject).length()))
      {
        Ki(paramInt1);
        AppMethodBeat.o(26891);
        break;
      }
      localObject = paramView.getLayout();
      if (localObject == null)
      {
        Ki(paramInt1);
        AppMethodBeat.o(26891);
        break;
      }
      float f1 = ((Layout)localObject).getPrimaryHorizontal(paramInt2) + paramView.getPaddingLeft();
      int i = paramView.getPaddingTop();
      float f2 = ((Layout)localObject).getLineTop(((Layout)localObject).getLineForOffset(paramInt2)) + i;
      float f3 = f1;
      float f4 = f2;
      label283: boolean bool;
      if (paramView.getEditTextType() != 0)
      {
        f2 = f2 + paramView.getHeight() - this.uRi;
        if (paramInt1 == 3)
        {
          f3 = f1 + this.uRr;
          f4 = f2;
        }
      }
      else
      {
        localObject = new int[2];
        paramView.getLocationOnScreen((int[])localObject);
        switch (paramInt1)
        {
        default:
          bool = false;
        case 2:
        case 3:
        case 4:
        }
      }
      while (true)
      {
        if (!bool)
          Ki(paramInt1);
        AppMethodBeat.o(26891);
        break;
        f3 = f1;
        f4 = f2;
        if (paramInt1 != 4)
          break label283;
        f3 = f1 - this.uRr;
        f4 = f2;
        break label283;
        bool = a(2, paramRecyclerView, this.uRw, (int)(f3 + localObject[0] - this.uRq), (int)(localObject[1] + f4));
        continue;
        bool = a(3, paramRecyclerView, this.uRx, (int)(f3 + localObject[0] - this.uRx.getWidth()), (int)(localObject[1] + f4));
        continue;
        bool = a(4, paramRecyclerView, this.uRy, (int)(f3 + localObject[0]), (int)(localObject[1] + f4));
      }
      label487: paramView = null;
    }
  }

  private boolean a(int paramInt1, RecyclerView paramRecyclerView, PopupWindow paramPopupWindow, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    AppMethodBeat.i(26892);
    if ((!mHasInit) || (paramRecyclerView == null) || (paramPopupWindow == null))
      AppMethodBeat.o(26892);
    while (true)
    {
      return bool;
      if ((paramInt3 >= o(paramRecyclerView)) && (paramInt3 <= this.mScreenHeight - dfc()))
        break;
      AppMethodBeat.o(26892);
    }
    if (paramPopupWindow.isShowing())
    {
      paramPopupWindow.update(paramInt2, paramInt3, -1, -1, false);
      aq(paramInt1, paramInt2, paramInt3);
    }
    while (true)
    {
      if (paramInt1 == 2)
      {
        dfk();
        this.uRE.ae(3000L, 0L);
      }
      bool = true;
      AppMethodBeat.o(26892);
      break;
      paramPopupWindow.showAtLocation(paramRecyclerView, 0, paramInt2, paramInt3);
      aq(paramInt1, paramInt2, paramInt3);
    }
  }

  private void aq(int paramInt1, int paramInt2, int paramInt3)
  {
    if (!mHasInit);
    while (true)
    {
      return;
      switch (paramInt1)
      {
      default:
        break;
      case 2:
        if ((this.uRt != null) && (this.uRt.length == 2))
        {
          this.uRt[0] = paramInt2;
          this.uRt[1] = paramInt3;
        }
        break;
      case 3:
        if ((this.uRu != null) && (this.uRu.length == 2))
        {
          this.uRu[0] = paramInt2;
          this.uRu[1] = paramInt3;
        }
        break;
      case 4:
        if ((this.uRv != null) && (this.uRv.length == 2))
        {
          this.uRv[0] = paramInt2;
          this.uRv[1] = paramInt3;
        }
        break;
      }
    }
  }

  private int ar(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    AppMethodBeat.i(26897);
    if (!mHasInit)
    {
      AppMethodBeat.o(26897);
      paramInt1 = i;
    }
    while (true)
    {
      return paramInt1;
      boolean bool;
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(26897);
        paramInt1 = i;
        break;
      case 2:
        bool = H(paramInt2, paramInt3, paramInt2, paramInt3);
      case 3:
      case 4:
        while (true)
        {
          if (!bool)
            break label242;
          paramInt1 = 3;
          AppMethodBeat.o(26897);
          break;
          if ((this.uRB == null) || (paramInt2 > this.uRB.endPos) || ((paramInt2 == this.uRB.endPos) && (paramInt3 >= this.uRB.uRf)))
          {
            AppMethodBeat.o(26897);
            paramInt1 = 1;
            break;
          }
          bool = H(paramInt2, paramInt3, this.uRB.endPos, this.uRB.uRf);
          continue;
          if ((this.uRB == null) || (paramInt2 < this.uRB.coc) || ((paramInt2 == this.uRB.coc) && (paramInt3 <= this.uRB.startOffset)))
          {
            AppMethodBeat.o(26897);
            paramInt1 = 1;
            break;
          }
          bool = H(this.uRB.coc, this.uRB.startOffset, paramInt2, paramInt3);
        }
        label242: paramInt1 = 2;
        AppMethodBeat.o(26897);
      }
    }
  }

  private ArrayList<com.tencent.mm.plugin.wenote.model.a.c> b(boolean paramBoolean, ArrayList<com.tencent.mm.plugin.wenote.model.a.c> paramArrayList, String paramString)
  {
    AppMethodBeat.i(26906);
    d locald = dfd();
    dff();
    ArrayList localArrayList = new ArrayList();
    if (locald.dfa() != 3)
    {
      ab.e("NoteSelectManager", "getAndProcessSelectedDataInMultiSelect: incorrect select");
      paramArrayList = null;
      AppMethodBeat.o(26906);
    }
    int i;
    while (true)
    {
      return paramArrayList;
      i = locald.coc;
      int j = locald.endPos;
      if (j >= locald.coc)
      {
        Object localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(j);
        i locali;
        SpannableStringBuilder localSpannableStringBuilder;
        if (localObject != null)
          if ((j == locald.endPos) && (((com.tencent.mm.plugin.wenote.model.a.c)localObject).getType() == 1))
          {
            locali = (i)localObject;
            localSpannableStringBuilder = a(locali, 0, locald.uRf, false, paramBoolean, "", false);
            if (!bo.ac(localSpannableStringBuilder))
            {
              localObject = new i();
              ((i)localObject).content = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(localSpannableStringBuilder);
              ((i)localObject).uNV = -1;
              ((i)localObject).uNT = false;
              localArrayList.add(localObject);
            }
            if ((paramBoolean) && (bo.isNullOrNil(locali.content)))
              com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().au(j, true);
          }
        while (true)
        {
          j--;
          break;
          if ((j == locald.coc) && (((com.tencent.mm.plugin.wenote.model.a.c)localObject).getType() == 1))
          {
            localObject = (i)localObject;
            localSpannableStringBuilder = a((i)localObject, locald.startOffset, 0, true, paramBoolean, "", false);
            if (!bo.ac(localSpannableStringBuilder))
            {
              locali = new i();
              locali.content = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a(localSpannableStringBuilder);
              locali.uNV = -1;
              locali.uNT = false;
              localArrayList.add(locali);
            }
            if ((paramBoolean) && (bo.isNullOrNil(((i)localObject).content)))
              com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().au(j, true);
            else
              i++;
          }
          else
          {
            localArrayList.add(com.tencent.mm.plugin.wenote.b.c.c((com.tencent.mm.plugin.wenote.model.a.c)localObject));
            if (paramBoolean)
              com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().au(j, true);
          }
        }
      }
      if (paramBoolean)
      {
        j = i + 1;
        if ((paramArrayList == null) || (paramArrayList.size() <= 0))
          break;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().d(i, paramArrayList);
        j = paramArrayList.size() + i;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().gG(i - 1, j);
      }
      Collections.reverse(localArrayList);
      AppMethodBeat.o(26906);
      paramArrayList = localArrayList;
    }
    paramArrayList = new i();
    if (paramString != null);
    while (true)
    {
      paramArrayList.content = paramString;
      paramArrayList.uNT = false;
      paramArrayList.uNV = -1;
      com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(i, paramArrayList);
      break;
      paramString = "";
    }
  }

  public static e dfb()
  {
    AppMethodBeat.i(26871);
    if (uRg == null);
    try
    {
      if (uRg == null)
      {
        locale = new com/tencent/mm/plugin/wenote/model/nativenote/c/e;
        locale.<init>();
        uRg = locale;
      }
      e locale = uRg;
      AppMethodBeat.o(26871);
      return locale;
    }
    finally
    {
      AppMethodBeat.o(26871);
    }
  }

  private int dfc()
  {
    AppMethodBeat.i(26873);
    int i;
    if (this.uRA != null)
    {
      i = this.uRA.dec() + this.uRA.ded();
      AppMethodBeat.o(26873);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(26873);
    }
  }

  private void dfe()
  {
    AppMethodBeat.i(26878);
    if (this.uRA != null)
      this.uRA.deb();
    AppMethodBeat.o(26878);
  }

  private void dfk()
  {
    AppMethodBeat.i(26893);
    if (this.uRE == null)
    {
      this.uRE = new ap(new ap.a()
      {
        public final boolean BI()
        {
          AppMethodBeat.i(26864);
          if ((e.this.dfa() == 1) && (e.b(e.this)))
            e.this.dfh();
          AppMethodBeat.o(26864);
          return true;
        }
      }
      , false);
      AppMethodBeat.o(26893);
    }
    while (true)
    {
      return;
      this.uRE.stopTimer();
      AppMethodBeat.o(26893);
    }
  }

  private void dfl()
  {
    AppMethodBeat.i(26898);
    if (this.uRC == null)
    {
      this.uRC = new b();
      AppMethodBeat.o(26898);
    }
    while (true)
    {
      return;
      this.uRC.reset();
      AppMethodBeat.o(26898);
    }
  }

  private void dfm()
  {
    AppMethodBeat.i(26899);
    if (this.uRD == null)
    {
      this.uRD = new ap(new e.9(this), true);
      AppMethodBeat.o(26899);
    }
    while (true)
    {
      return;
      this.uRD.stopTimer();
      AppMethodBeat.o(26899);
    }
  }

  private int dfn()
  {
    AppMethodBeat.i(26901);
    int i = 0;
    if (this.uRA != null)
      i = this.uRA.dec();
    int j = i;
    if (i == 0)
    {
      j = i;
      if (this.uRA != null)
        j = this.uRA.ded();
    }
    i = j;
    if (j == 0)
      i = 150;
    j = this.mScreenHeight;
    AppMethodBeat.o(26901);
    return j - i;
  }

  private void dfo()
  {
    AppMethodBeat.i(26903);
    if (this.uRA != null)
      this.uRA.dea();
    AppMethodBeat.o(26903);
  }

  private boolean dfq()
  {
    boolean bool1 = false;
    AppMethodBeat.i(26908);
    boolean bool2 = t(this.uRF, false);
    boolean bool3 = t(this.uRG, false);
    boolean bool4 = t(this.uRH, dfr());
    boolean bool5 = t(this.uRI, dfs());
    boolean bool6 = t(this.uRJ, dft());
    boolean bool7 = t(this.uRK, dfu());
    boolean bool8 = t(this.uRL, dfv());
    boolean bool9 = t(this.uRM, dfw());
    if ((bool2) || (bool3) || (bool4) || (bool5) || (bool6) || (bool7) || (bool8) || (bool9))
    {
      bool1 = true;
      AppMethodBeat.o(26908);
    }
    while (true)
    {
      return bool1;
      AppMethodBeat.o(26908);
    }
  }

  private boolean dfr()
  {
    AppMethodBeat.i(26910);
    boolean bool;
    if (dfa() != 1)
    {
      AppMethodBeat.o(26910);
      bool = false;
    }
    while (true)
    {
      return bool;
      com.tencent.mm.plugin.wenote.model.a.c localc = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(this.uRB.coc);
      if ((localc != null) && ((com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().size() > 1) || (localc.getType() != 1) || (!bo.isNullOrNil(((i)localc).content))))
      {
        AppMethodBeat.o(26910);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(26910);
        bool = false;
      }
    }
  }

  private boolean dfs()
  {
    AppMethodBeat.i(26911);
    int i = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().dex();
    int j = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().dey();
    Object localObject = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(i);
    com.tencent.mm.plugin.wenote.model.a.c localc = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(j);
    boolean bool;
    if ((localObject == null) || (localc == null))
    {
      AppMethodBeat.o(26911);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((this.uRB != null) && (this.uRB.coc == i) && (this.uRB.startOffset == 0) && (this.uRB.endPos == j))
      {
        if (localc.getType() == 1)
        {
          localObject = com.tencent.mm.plugin.wenote.model.nativenote.a.a.ahb(((i)localc).content);
          if (localObject == null)
          {
            AppMethodBeat.o(26911);
            bool = false;
          }
          else if (this.uRB.uRf == ((Spanned)localObject).length())
          {
            AppMethodBeat.o(26911);
            bool = false;
          }
        }
        else if ((localc.getType() != 1) && (this.uRB.uRf == 1))
        {
          AppMethodBeat.o(26911);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(26911);
        bool = true;
      }
    }
  }

  private boolean dft()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(26912);
    if (!this.uRh)
      AppMethodBeat.o(26912);
    while (true)
    {
      return bool2;
      int i = dfa();
      if ((i != 0) && (i != 1))
        break;
      AppMethodBeat.o(26912);
    }
    bool2 = bool1;
    if (this.uRA != null)
      if (this.uRA.dee())
        break label80;
    label80: for (bool2 = bool1; ; bool2 = false)
    {
      AppMethodBeat.o(26912);
      break;
    }
  }

  private boolean dfu()
  {
    AppMethodBeat.i(26913);
    int i = dfa();
    boolean bool;
    if ((this.uRh) && ((i == 2) || (i == 3)))
    {
      bool = true;
      AppMethodBeat.o(26913);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(26913);
    }
  }

  private boolean dfv()
  {
    AppMethodBeat.i(26914);
    int i = dfa();
    boolean bool;
    if ((i == 2) || (i == 3))
    {
      bool = true;
      AppMethodBeat.o(26914);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(26914);
    }
  }

  private boolean dfw()
  {
    boolean bool = true;
    AppMethodBeat.i(26915);
    if ((!this.uRh) || (dfa() == 0))
    {
      AppMethodBeat.o(26915);
      bool = false;
    }
    while (true)
    {
      return bool;
      ah.getContext();
      if (com.tencent.mm.plugin.wenote.model.nativenote.manager.f.deC() != 1)
      {
        AppMethodBeat.o(26915);
      }
      else
      {
        AppMethodBeat.o(26915);
        bool = false;
      }
    }
  }

  public static void g(TextView paramTextView, int paramInt)
  {
    AppMethodBeat.i(26902);
    if (paramTextView != null)
      paramTextView.setTextSize(1, paramInt);
    AppMethodBeat.o(26902);
  }

  private RecyclerView getRecyclerView()
  {
    AppMethodBeat.i(26872);
    RecyclerView localRecyclerView;
    if (this.uRA != null)
    {
      localRecyclerView = this.uRA.def();
      AppMethodBeat.o(26872);
    }
    while (true)
    {
      return localRecyclerView;
      localRecyclerView = null;
      AppMethodBeat.o(26872);
    }
  }

  private boolean i(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(26894);
    if ((!mHasInit) || (paramRecyclerView == null) || (this.uRz == null))
      AppMethodBeat.o(26894);
    while (true)
    {
      return bool;
      if ((paramInt2 >= o(paramRecyclerView)) && (paramInt2 <= this.mScreenHeight - dfc()))
        break;
      AppMethodBeat.o(26894);
    }
    if (this.uRz.isShowing())
      this.uRz.update(paramInt1, paramInt2, -1, -1, false);
    while (true)
    {
      bool = true;
      AppMethodBeat.o(26894);
      break;
      this.uRz.showAtLocation(paramRecyclerView, 0, paramInt1, paramInt2);
    }
  }

  public static boolean isEnabled()
  {
    return mHasInit;
  }

  private int o(RecyclerView paramRecyclerView)
  {
    AppMethodBeat.i(26900);
    int i = 150;
    int j = i;
    if (paramRecyclerView != null)
    {
      paramRecyclerView.getLocationOnScreen(this.uRs);
      j = i;
      if (z(this.uRs))
        j = this.uRs[1];
    }
    AppMethodBeat.o(26900);
    return j;
  }

  private void or(boolean paramBoolean)
  {
    AppMethodBeat.i(26896);
    if ((!mHasInit) || (this.uRw == null) || (this.uRx == null) || (this.uRy == null) || (this.uRB == null))
      AppMethodBeat.o(26896);
    RecyclerView localRecyclerView;
    int i;
    while (true)
    {
      return;
      localRecyclerView = getRecyclerView();
      if (localRecyclerView == null)
      {
        AppMethodBeat.o(26896);
      }
      else if ((this.uRC == null) || (this.uRC.getType() != 1))
      {
        AppMethodBeat.o(26896);
      }
      else
      {
        i = this.uRC.klY;
        if ((i == 2) || (i == 3) || (i == 4))
          break;
        AppMethodBeat.o(26896);
      }
    }
    float f1 = this.uRC.uQU - this.uRC.hke;
    float f2 = this.uRC.uQV;
    float f3 = this.uRC.hkf;
    f2 = this.uRi / 2 + (f2 - f3);
    label194: View localView;
    Object localObject1;
    Object localObject2;
    int j;
    if (i == 2)
    {
      f3 = f1 + this.uRw.getWidth() / 2;
      localRecyclerView.getLocationOnScreen(this.uRs);
      localView = localRecyclerView.x(f3 - this.uRs[0], f2 - this.uRs[1]);
      localObject1 = f.er(localView);
      localObject2 = null;
      if (localObject1 != null)
        break label310;
      j = 2;
    }
    while (true)
      switch (j)
      {
      default:
        AppMethodBeat.o(26896);
        break;
        f3 = f1;
        if (i != 3)
          break label194;
        f3 = f1 + this.uRx.getWidth();
        break label194;
        if (((c)localObject1).uRc != null)
        {
          localObject2 = ((c)localObject1).uRc;
          localObject1 = new int[2];
          ((WXRTEditText)localObject2).getLocationOnScreen((int[])localObject1);
          j = ((WXRTEditText)localObject2).getOffsetForPosition(f3 - localObject1[0], f2 - localObject1[1]);
          j = ar(i, ((WXRTEditText)localObject2).getPosInDataList(), j);
        }
        else if ((((c)localObject1).uRd != null) && (((c)localObject1).uRe != null))
        {
          if (i == 3)
          {
            localObject1 = ((c)localObject1).uRd;
            k = ar(i, ((WXRTEditText)localObject1).getPosInDataList(), 0);
            if (k != 2)
            {
              j = k;
              localObject2 = localObject1;
              if (k != 3)
                break label713;
            }
            a(i, localRecyclerView, this.uRx, (int)(this.uRC.uQU - this.uRC.hke), (int)(this.uRC.uQV - this.uRC.hkf));
            j = k;
            localObject2 = localObject1;
            continue;
          }
          if (i == 4)
          {
            localObject1 = ((c)localObject1).uRe;
            k = ar(i, ((WXRTEditText)localObject1).getPosInDataList(), 1);
            if (k != 2)
            {
              j = k;
              localObject2 = localObject1;
              if (k != 3)
                break label713;
            }
            a(i, localRecyclerView, this.uRy, (int)(this.uRC.uQU - this.uRC.hke), (int)(this.uRC.uQV - this.uRC.hkf));
            j = k;
            localObject2 = localObject1;
            continue;
          }
          localObject2 = new int[2];
          localView.getLocationOnScreen((int[])localObject2);
          if (f3 <= localObject2[0] + localView.getWidth() / 2)
            localObject1 = ((c)localObject1).uRd;
          for (int k = ar(i, ((WXRTEditText)localObject1).getPosInDataList(), 0); ; k = ar(i, ((WXRTEditText)localObject1).getPosInDataList(), 1))
          {
            if (k != 2)
            {
              j = k;
              localObject2 = localObject1;
              if (k != 3);
            }
            else
            {
              a(i, localRecyclerView, this.uRw, (int)(this.uRC.uQU - this.uRC.hke), (int)(this.uRC.uQV - this.uRC.hkf));
              localObject2 = localObject1;
              j = k;
            }
            break;
            localObject1 = ((c)localObject1).uRe;
          }
        }
        break;
      case 1:
        j = 0;
      case 2:
      case 3:
        label914: 
        while (true)
          label310: label713: if (j != 0)
          {
            if ((!paramBoolean) || ((this.uRC.uQV >= o(localRecyclerView)) && (this.uRC.uQV <= dfn())) || ((this.uRD != null) && (!this.uRD.doT())))
              break label1162;
            dfm();
            this.uRD.ae(100L, 100L);
            AppMethodBeat.o(26896);
            break;
            j = 1;
            continue;
            localObject1 = ((WXRTEditText)localObject2).getText();
            j = dfa();
            if ((this.uRh) && (localObject1 != null) && (j == 1))
            {
              if (!((WXRTEditText)localObject2).hasFocus())
                ((WXRTEditText)localObject2).requestFocus();
              if ((((WXRTEditText)localObject2).getEditTextType() == 1) || (((WXRTEditText)localObject2).getEditTextType() == 2))
              {
                ((WXRTEditText)localObject2).setIgnoreSelectChangeByMultiSelect(true);
                ((WXRTEditText)localObject2).setSelection(0);
                ((WXRTEditText)localObject2).setIgnoreSelectChangeByMultiSelect(false);
                if ((j == 3) || (j == 0))
                  dfe();
                dfh();
                h(true, 0L);
                if (i != 4)
                  break label1146;
              }
            }
            label1146: for (j = this.uRB.uRf; ; j = this.uRB.startOffset)
            {
              a(i, localRecyclerView, localView, j);
              j = 1;
              break;
              if (this.uRB.startOffset > ((Editable)localObject1).length())
                break label914;
              ((WXRTEditText)localObject2).setIgnoreSelectChangeByMultiSelect(true);
              ((WXRTEditText)localObject2).setSelection(this.uRB.startOffset);
              ((WXRTEditText)localObject2).setIgnoreSelectChangeByMultiSelect(false);
              break label914;
              if ((!this.uRh) || (localObject1 == null) || (j != 2) || (!((WXRTEditText)localObject2).hasFocus()))
                break label914;
              if ((((WXRTEditText)localObject2).getEditTextType() == 1) || (((WXRTEditText)localObject2).getEditTextType() == 2))
              {
                ((WXRTEditText)localObject2).setIgnoreSelectChangeByMultiSelect(true);
                ((WXRTEditText)localObject2).setSelection(0);
                ((WXRTEditText)localObject2).setIgnoreSelectChangeByMultiSelect(false);
                break label914;
              }
              if ((this.uRB.startOffset > ((Editable)localObject1).length()) || (this.uRB.uRf > ((Editable)localObject1).length()))
                break label914;
              ((WXRTEditText)localObject2).setIgnoreSelectChangeByMultiSelect(true);
              ((WXRTEditText)localObject2).setSelection(this.uRB.startOffset, this.uRB.uRf);
              ((WXRTEditText)localObject2).setIgnoreSelectChangeByMultiSelect(false);
              break label914;
            }
          }
        dfm();
        label1162: AppMethodBeat.o(26896);
        break;
        j = 0;
      }
  }

  private static boolean t(View paramView, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(26909);
    if (paramView == null)
    {
      AppMethodBeat.o(26909);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (paramBoolean)
      {
        paramView.setVisibility(0);
        paramBoolean = true;
        AppMethodBeat.o(26909);
      }
      else
      {
        paramView.setVisibility(8);
        AppMethodBeat.o(26909);
        paramBoolean = bool;
      }
    }
  }

  private static boolean z(int[] paramArrayOfInt)
  {
    boolean bool = true;
    if ((mHasInit) && (paramArrayOfInt != null) && (paramArrayOfInt.length == 2) && (paramArrayOfInt[0] != -1) && (paramArrayOfInt[1] != -1));
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean H(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = false;
    AppMethodBeat.i(26876);
    if (!mHasInit)
    {
      AppMethodBeat.o(26876);
      return bool;
    }
    if (this.uRB == null)
    {
      this.uRB = new d(paramInt1, paramInt2, paramInt3, paramInt4);
      bool = true;
    }
    while (true)
    {
      if (bool)
        ab.d("NoteSelectManager", "setSelectInfo: %d:%d - %d:%d", new Object[] { Integer.valueOf(this.uRB.coc), Integer.valueOf(this.uRB.startOffset), Integer.valueOf(this.uRB.endPos), Integer.valueOf(this.uRB.uRf) });
      AppMethodBeat.o(26876);
      break;
      if ((this.uRB.coc != paramInt1) || (this.uRB.startOffset != paramInt2) || (this.uRB.endPos != paramInt3) || (this.uRB.uRf != paramInt4))
      {
        this.uRB.set(paramInt1, paramInt2, paramInt3, paramInt4);
        bool = true;
      }
      else
      {
        bool = false;
      }
    }
  }

  public final int Kh(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(26877);
    if ((!mHasInit) || (this.uRB == null))
    {
      AppMethodBeat.o(26877);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      if ((dfa() == 0) || (paramInt < this.uRB.coc) || (paramInt > this.uRB.endPos))
      {
        AppMethodBeat.o(26877);
        paramInt = i;
      }
      else if ((paramInt == this.uRB.coc) && (paramInt == this.uRB.endPos))
      {
        paramInt = 1;
        AppMethodBeat.o(26877);
      }
      else if ((paramInt > this.uRB.coc) && (paramInt < this.uRB.endPos))
      {
        paramInt = 2;
        AppMethodBeat.o(26877);
      }
      else if ((paramInt == this.uRB.coc) && (paramInt < this.uRB.endPos))
      {
        paramInt = 4;
        AppMethodBeat.o(26877);
      }
      else if ((paramInt > this.uRB.coc) && (paramInt == this.uRB.endPos))
      {
        paramInt = 3;
        AppMethodBeat.o(26877);
      }
      else
      {
        AppMethodBeat.o(26877);
        paramInt = i;
      }
    }
  }

  public final void a(int paramInt, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(26895);
    if ((!mHasInit) || (this.mHandler == null))
      AppMethodBeat.o(26895);
    while (true)
    {
      return;
      if ((this.uRC == null) || (this.uRC.getType() != 1) || (this.uRC.klY == paramInt))
        break;
      AppMethodBeat.o(26895);
    }
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(26895);
      break;
      dfl();
      if (!dfg())
        op(true);
      this.uRC.a(paramInt, paramMotionEvent.getRawX(), paramMotionEvent.getRawY(), paramMotionEvent.getX(), paramMotionEvent.getY(), 0);
      AppMethodBeat.o(26895);
      break;
      if ((this.uRC != null) && (this.uRC.getType() == 1))
      {
        this.uRC.uQU = paramMotionEvent.getRawX();
        this.uRC.uQV = paramMotionEvent.getRawY();
        or(true);
        AppMethodBeat.o(26895);
        break;
        dfl();
        this.mHandler.postDelayed(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(26865);
            e.this.oq(true);
            e.this.op(true);
            AppMethodBeat.o(26865);
          }
        }
        , 200L);
      }
    }
  }

  public final void a(View paramView1, View paramView2, View paramView3, int paramInt)
  {
    AppMethodBeat.i(26882);
    if ((!mHasInit) || (paramView1 == null) || (paramView2 == null) || (paramView3 == null) || (this.uRB == null))
      AppMethodBeat.o(26882);
    while (true)
    {
      return;
      switch (Kh(paramInt))
      {
      default:
      case 0:
      case 1:
      case 2:
      case 4:
      case 3:
      }
      do
      {
        paramView1.setVisibility(8);
        paramView2.setVisibility(4);
        paramView3.setVisibility(4);
        AppMethodBeat.o(26882);
        break;
        paramView1.setVisibility(8);
        paramView2.setVisibility(4);
        paramView3.setVisibility(4);
        AppMethodBeat.o(26882);
        break;
        if (this.uRB.startOffset == this.uRB.uRf)
          paramView1.setVisibility(8);
        while (true)
        {
          paramView2.setVisibility(4);
          paramView3.setVisibility(4);
          AppMethodBeat.o(26882);
          break;
          paramView1.setVisibility(0);
        }
        paramView1.setVisibility(0);
        paramView2.setVisibility(0);
        paramView3.setVisibility(0);
        AppMethodBeat.o(26882);
        break;
        if (this.uRB.startOffset == 0)
        {
          paramView1.setVisibility(0);
          paramView2.setVisibility(4);
          paramView3.setVisibility(0);
          AppMethodBeat.o(26882);
          break;
        }
        paramView1.setVisibility(8);
        paramView2.setVisibility(4);
        paramView3.setVisibility(4);
        AppMethodBeat.o(26882);
        break;
      }
      while (this.uRB.uRf == 0);
      paramView1.setVisibility(0);
      paramView2.setVisibility(0);
      paramView3.setVisibility(4);
      AppMethodBeat.o(26882);
    }
  }

  public final void ab(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(26880);
    if (!mHasInit)
      AppMethodBeat.o(26880);
    while (true)
    {
      return;
      dfj();
      dfh();
      h(true, 50L);
      oq(paramBoolean1);
      oo(paramBoolean2);
      AppMethodBeat.o(26880);
    }
  }

  public final int dfa()
  {
    AppMethodBeat.i(26874);
    int i;
    if (!mHasInit)
    {
      i = 0;
      AppMethodBeat.o(26874);
    }
    while (true)
    {
      return i;
      if (this.uRB == null)
        this.uRB = new d();
      i = this.uRB.dfa();
      AppMethodBeat.o(26874);
    }
  }

  public final d dfd()
  {
    AppMethodBeat.i(26875);
    d locald;
    if (!mHasInit)
    {
      locald = new d();
      AppMethodBeat.o(26875);
    }
    while (true)
    {
      return locald;
      if (this.uRB == null)
        this.uRB = new d();
      locald = new d(this.uRB.coc, this.uRB.startOffset, this.uRB.endPos, this.uRB.uRf);
      AppMethodBeat.o(26875);
    }
  }

  public final void dff()
  {
    AppMethodBeat.i(26879);
    if (!mHasInit)
      AppMethodBeat.o(26879);
    while (true)
    {
      return;
      H(-1, -1, -1, -1);
      h(true, 0L);
      dfj();
      dfh();
      AppMethodBeat.o(26879);
    }
  }

  public final boolean dfg()
  {
    AppMethodBeat.i(26883);
    boolean bool;
    if ((this.uRz != null) && (this.uRz.isShowing()))
    {
      bool = true;
      AppMethodBeat.o(26883);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(26883);
    }
  }

  public final void dfh()
  {
    AppMethodBeat.i(26884);
    if (this.uRz != null)
      this.uRz.dismiss();
    AppMethodBeat.o(26884);
  }

  public final boolean dfi()
  {
    AppMethodBeat.i(26887);
    boolean bool;
    if ((this.uRw != null) && (this.uRw.isShowing()))
    {
      bool = true;
      AppMethodBeat.o(26887);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(26887);
    }
  }

  public final void dfj()
  {
    AppMethodBeat.i(26888);
    if (!mHasInit)
      AppMethodBeat.o(26888);
    while (true)
    {
      return;
      Ki(2);
      Ki(3);
      Ki(4);
      AppMethodBeat.o(26888);
    }
  }

  public final void dfp()
  {
    AppMethodBeat.i(26904);
    ab.i("NoteSelectManager", "deleteSelectedData");
    if (!mHasInit)
    {
      ab.e("NoteSelectManager", "deleteSelectedData: not init");
      AppMethodBeat.o(26904);
    }
    while (true)
    {
      return;
      dfh();
      int i = dfa();
      if (i == 2)
      {
        a(true, null, "");
        AppMethodBeat.o(26904);
      }
      else if (i == 3)
      {
        b(true, null, "");
        AppMethodBeat.o(26904);
      }
      else
      {
        ab.e("NoteSelectManager", "deleteSelectedData: not in select");
        dfo();
        AppMethodBeat.o(26904);
      }
    }
  }

  public final void h(boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(26881);
    if ((!mHasInit) || (this.mHandler == null))
      AppMethodBeat.o(26881);
    while (true)
    {
      return;
      this.mHandler.postDelayed(new e.1(this, paramBoolean), paramLong);
      AppMethodBeat.o(26881);
    }
  }

  public final boolean isEditable()
  {
    if ((mHasInit) && (this.uRh));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void oo(final boolean paramBoolean)
  {
    AppMethodBeat.i(26885);
    this.mHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(26863);
        e.this.op(paramBoolean);
        AppMethodBeat.o(26863);
      }
    }
    , 50L);
    AppMethodBeat.o(26885);
  }

  public final void op(boolean paramBoolean)
  {
    AppMethodBeat.i(26886);
    if ((!mHasInit) || (this.uRz == null))
      AppMethodBeat.o(26886);
    RecyclerView localRecyclerView;
    while (true)
    {
      return;
      localRecyclerView = getRecyclerView();
      i = dfa();
      if ((localRecyclerView == null) || (i == 0) || ((i == 1) && (!paramBoolean)) || ((this.uRC != null) && (this.uRC.getType() == 1)))
      {
        dfh();
        AppMethodBeat.o(26886);
      }
      else
      {
        if (dfq())
          break;
        dfh();
        AppMethodBeat.o(26886);
      }
    }
    int j = -1;
    int k = -1000;
    int m = o(localRecyclerView);
    int n = dfn();
    int i1 = 0;
    int i2 = 0;
    int i = i2;
    int i3 = i1;
    if (this.uRz != null)
    {
      i = i2;
      i3 = i1;
      if (this.uRz.getContentView() != null)
      {
        this.uRz.getContentView().measure(0, 0);
        i = this.uRz.getContentView().getMeasuredHeight();
        i3 = this.uRl * 2 + i;
        i = this.uRz.getContentView().getMeasuredWidth() + this.uRl * 2;
      }
    }
    int i4;
    label224: int i5;
    if (i3 == 0)
    {
      i4 = this.uRn;
      if (i != 0)
        break label429;
      i5 = this.uRo;
      label234: if ((this.uRw == null) || (!this.uRw.isShowing()) || (!z(this.uRt)))
        break label474;
      i3 = this.uRt[1] - i4;
      i = this.uRt[1] + this.uRw.getHeight() - this.uRp;
      if ((i3 < m) || (i3 > n))
        break label435;
      i1 = this.uRt[0];
      i = i3;
      i3 = i1;
    }
    while (true)
    {
      label321: i1 = i;
      if (i == -1)
      {
        Object localObject = localRecyclerView.getLayoutManager();
        if ((localObject == null) || (!(localObject instanceof LinearLayoutManager)))
          break label956;
        localObject = (LinearLayoutManager)localObject;
        i3 = ((LinearLayoutManager)localObject).iQ();
        i1 = ((LinearLayoutManager)localObject).iS();
        if ((this.uRB.coc > i3) || (this.uRB.endPos < i1))
          break label956;
        i1 = 300;
        i3 = -1000;
      }
      while (true)
      {
        if (i1 == -1)
        {
          dfh();
          AppMethodBeat.o(26886);
          break;
          i4 = i3;
          break label224;
          label429: i5 = i;
          break label234;
          label435: i2 = k;
          i1 = j;
          if (i < m)
            break label967;
          i2 = k;
          i1 = j;
          if (i > n)
            break label967;
          i3 = this.uRt[0];
          break label321;
          label474: i = k;
          i3 = j;
          if (this.uRx != null)
          {
            i = k;
            i3 = j;
            if (this.uRx.isShowing())
            {
              i = k;
              i3 = j;
              if (z(this.uRu))
              {
                i3 = this.uRu[1] - i4;
                i1 = this.uRu[1] + this.uRx.getHeight() - this.uRp;
                if ((i3 < m) || (i3 > n))
                  break label689;
                i = this.uRu[0];
              }
            }
          }
          while (true)
          {
            i2 = i;
            i1 = i3;
            if (this.uRy == null)
              break label967;
            i2 = i;
            i1 = i3;
            if (!this.uRy.isShowing())
              break label967;
            i2 = i;
            i1 = i3;
            if (!z(this.uRv))
              break label967;
            i1 = this.uRv[1] - i4;
            k = this.uRv[1] + this.uRy.getHeight() - this.uRp;
            if (i3 != -1)
              break label773;
            if ((i1 < m) || (i1 > n))
              break label731;
            i3 = this.uRv[0];
            i = i1;
            break;
            label689: i = k;
            i3 = j;
            if (i1 >= m)
            {
              i = k;
              i3 = j;
              if (i1 <= n)
              {
                i = this.uRu[0];
                i3 = i1;
              }
            }
          }
          label731: i2 = i;
          i1 = i3;
          if (k < m)
            break label967;
          i2 = i;
          i1 = i3;
          if (k > n)
            break label967;
          i3 = this.uRv[0];
          i = k;
          break label321;
          label773: i2 = i;
          i1 = i3;
          if (i3 + i4 <= this.uRv[1])
            break label967;
          i2 = i;
          i1 = i3;
          if (k < m)
            break label967;
          i2 = i;
          i1 = i3;
          if (k > n)
            break label967;
          i3 = this.uRv[0];
          i = k;
          break label321;
        }
        i = this.mScreenWidth / 3;
        i2 = this.mScreenWidth * 2 / 3;
        if ((i3 == -1000) || ((i3 >= i) && (i3 <= i2)))
        {
          i(localRecyclerView, (this.mScreenWidth - i5) / 2, i1);
          AppMethodBeat.o(26886);
          break;
        }
        if (i3 < i)
        {
          i(localRecyclerView, this.uRm, i1);
          AppMethodBeat.o(26886);
          break;
        }
        i(localRecyclerView, this.mScreenWidth - i5 - this.uRm, i1);
        AppMethodBeat.o(26886);
        break;
        label956: i3 = -1000;
        i1 = i;
      }
      label967: i3 = i2;
      i = i1;
    }
  }

  public final void oq(boolean paramBoolean)
  {
    AppMethodBeat.i(26890);
    if (!mHasInit)
      AppMethodBeat.o(26890);
    while (true)
    {
      return;
      RecyclerView localRecyclerView = getRecyclerView();
      int i = dfa();
      if ((localRecyclerView == null) || (i == 0) || ((i == 1) && (!paramBoolean)))
      {
        dfj();
        AppMethodBeat.o(26890);
      }
      else
      {
        View localView1 = f.f(localRecyclerView, this.uRB.coc);
        View localView2 = f.f(localRecyclerView, this.uRB.endPos);
        if (i == 1)
        {
          Ki(3);
          Ki(4);
          a(2, localRecyclerView, localView1, this.uRB.startOffset);
          AppMethodBeat.o(26890);
        }
        else
        {
          Ki(2);
          a(3, localRecyclerView, localView1, this.uRB.startOffset);
          a(4, localRecyclerView, localView2, this.uRB.uRf);
          AppMethodBeat.o(26890);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.c.e
 * JD-Core Version:    0.6.2
 */