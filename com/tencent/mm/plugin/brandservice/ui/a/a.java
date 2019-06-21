package com.tencent.mm.plugin.brandservice.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.List;

public final class a extends com.tencent.mm.plugin.fts.a.d.a.a
{
  public ad ehM;
  public l hpS;
  public String iconUrl;
  public CharSequence jMY;
  public CharSequence jMZ;
  private a.b jNa;
  a jNb;
  public String username;

  public a(int paramInt)
  {
    super(4, paramInt);
    AppMethodBeat.i(14084);
    this.jNa = new a.b(this);
    this.jNb = new a();
    AppMethodBeat.o(14084);
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a.b Ps()
  {
    return this.jNa;
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(14085);
    this.username = this.hpS.mDx;
    this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.username);
    Object localObject = com.tencent.mm.aj.f.qX(this.username);
    label60: String str;
    int i;
    int j;
    boolean bool1;
    boolean bool3;
    boolean bool5;
    boolean bool6;
    if (localObject == null)
    {
      parama = "";
      this.iconUrl = parama;
      str = s.mJ(this.username);
      paramArrayOfObject = null;
      parama = null;
      i = 0;
      j = 0;
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      bool5 = false;
      bool6 = false;
      if ((localObject != null) && (!((com.tencent.mm.aj.d)localObject).adV()))
        break label336;
    }
    label336: for (int k = 1; ; k = 0)
      switch (this.hpS.mDw)
      {
      default:
        bool4 = bool3;
        bool5 = bool6;
        if (i == 0)
          break label568;
        this.jMY = com.tencent.mm.pluginsdk.ui.e.j.d(paramContext, str, com.tencent.mm.bz.a.al(paramContext, 2131427813));
        this.jMY = com.tencent.mm.plugin.fts.a.f.a(com.tencent.mm.plugin.fts.a.a.d.a(this.jMY, this.mDz, bool4, bool5)).mDR;
        label247: if ((j != 0) && (k != 0))
        {
          this.jMZ = com.tencent.mm.pluginsdk.ui.e.j.d(paramContext, paramArrayOfObject, com.tencent.mm.bz.a.al(paramContext, 2131427813));
          this.jMZ = com.tencent.mm.plugin.fts.a.f.a(com.tencent.mm.plugin.fts.a.a.d.a(this.jMZ, this.mDz, bool4, bool5)).mDR;
          this.jMZ = TextUtils.concat(new CharSequence[] { parama, this.jMZ });
        }
        AppMethodBeat.o(14085);
        return;
        parama = ((com.tencent.mm.aj.d)localObject).field_brandIconURL;
        break label60;
      case 3:
      case 15:
      case 21:
      case 20:
      case 19:
      case 2:
      case 1:
      }
    boolean bool2 = true;
    label345: for (boolean bool4 = true; ; bool4 = bool1)
    {
      i = 1;
      bool5 = bool2;
      break;
      j = 1;
      paramArrayOfObject = this.ehM.Hq();
      parama = paramArrayOfObject;
      if (bo.isNullOrNil(paramArrayOfObject))
        parama = this.ehM.field_username;
      localObject = paramContext.getString(2131302833);
      paramArrayOfObject = parama;
      bool5 = bool6;
      bool4 = bool3;
      parama = (com.tencent.mm.plugin.fts.a.d.a.a.a)localObject;
      break;
      bool4 = true;
      bool2 = true;
      bool5 = bool4;
      Iterator localIterator = ((com.tencent.mm.api.j)g.K(com.tencent.mm.api.j.class)).cK(this.username).iterator();
      while (localIterator.hasNext())
      {
        this.jMZ = com.tencent.mm.pluginsdk.ui.e.j.d(paramContext, (String)localIterator.next(), com.tencent.mm.bz.a.al(paramContext, 2131427813));
        localObject = com.tencent.mm.plugin.fts.a.f.a(com.tencent.mm.plugin.fts.a.a.d.a(this.jMZ, this.mDz, bool2, bool5));
        if (((e)localObject).bFZ == 0)
          this.jMZ = ((e)localObject).mDR;
      }
      this.jMZ = TextUtils.concat(new CharSequence[] { this.jMZ, paramContext.getString(2131302801) + str });
      bool4 = bool2;
      break;
      this.jMY = com.tencent.mm.pluginsdk.ui.e.j.d(paramContext, str, com.tencent.mm.bz.a.al(paramContext, 2131427813));
      break label247;
      bool2 = false;
      break label345;
      bool2 = false;
    }
  }

  public final String aAp()
  {
    AppMethodBeat.i(14086);
    String str;
    if (this.jMY != null)
    {
      str = this.jMY.toString();
      AppMethodBeat.o(14086);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(14086);
    }
  }

  public final int aAq()
  {
    return this.hpS.mEK;
  }

  public final class a extends com.tencent.mm.plugin.fts.a.d.a.a.a
  {
    public View contentView;
    public ImageView ejo;
    public TextView gnB;
    public TextView gnC;

    public a()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.a.a
 * JD-Core Version:    0.6.2
 */