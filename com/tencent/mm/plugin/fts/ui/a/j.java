package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.c;
import com.tencent.mm.plugin.fts.a.a.d;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.a.d.a.b;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.m;

public final class j extends a
{
  public int actionType;
  public l hpS;
  public CharSequence mKK;
  public String mKL;
  public c mKM;
  private b mKN;
  j.a mKO;
  public CharSequence mnr;
  public String mnu;

  public j(int paramInt)
  {
    super(3, paramInt);
    AppMethodBeat.i(62003);
    this.actionType = -1;
    this.mKN = new b();
    this.mKO = new j.a(this);
    AppMethodBeat.o(62003);
  }

  public final a.b Ps()
  {
    return this.mKN;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    boolean bool1 = true;
    AppMethodBeat.i(62004);
    this.mKM = ((c)this.hpS.userData);
    if (this.mKM == null)
      AppMethodBeat.o(62004);
    while (true)
    {
      return;
      this.mnr = this.mKM.field_title;
      this.mKK = this.mKM.field_tag;
      this.mnu = this.mKM.field_iconPath;
      this.mKL = this.mKM.field_androidUrl;
      this.actionType = this.mKM.field_actionType;
      switch (this.hpS.mDw)
      {
      default:
        label128: AppMethodBeat.o(62004);
      case 3:
      case 4:
      case 2:
      case 1:
      }
    }
    boolean bool2 = true;
    while (true)
    {
      this.mnr = f.a(d.a(this.mnr, this.mDz, bool1, bool2)).mDR;
      AppMethodBeat.o(62004);
      break;
      this.mKK = f.a(d.a(this.mKK, this.mDz)).mDR;
      break label128;
      bool2 = false;
      continue;
      bool1 = false;
      bool2 = false;
    }
  }

  public final String aAp()
  {
    return this.mKM.field_title;
  }

  public final int aAq()
  {
    return this.hpS.mEK;
  }

  public final class b extends a.b
  {
    public b()
    {
      super();
    }

    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(62000);
      paramViewGroup = LayoutInflater.from(paramContext).inflate(2130969613, paramViewGroup, false);
      paramContext = (j.a)j.this.mKO;
      paramContext.ejo = ((ImageView)paramViewGroup.findViewById(2131821183));
      paramContext.gnB = ((TextView)paramViewGroup.findViewById(2131821185));
      paramContext.gnC = ((TextView)paramViewGroup.findViewById(2131820991));
      paramContext.contentView = paramViewGroup.findViewById(2131821182);
      paramViewGroup.setTag(paramContext);
      AppMethodBeat.o(62000);
      return paramViewGroup;
    }

    public final void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(62001);
      parama = (j.a)parama;
      parama1 = (j)parama1;
      m.p(parama.contentView, j.this.mFk);
      m.a(j.this.mnr, parama.gnB);
      m.a(j.this.mKK, parama.gnC);
      m.a(paramContext, parama.ejo, null, parama1.mnu, 2131231335);
      AppMethodBeat.o(62001);
    }

    public final boolean a(Context paramContext, a parama)
    {
      AppMethodBeat.i(62002);
      boolean bool = ((n)g.M(n.class)).getItemClickHandler(j.this.klY).a(paramContext, parama);
      AppMethodBeat.o(62002);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.j
 * JD-Core Version:    0.6.2
 */