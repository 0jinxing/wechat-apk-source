package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.ui.b.a;
import com.tencent.mm.plugin.fts.ui.b.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi.b;

public class m extends a
{
  public CharSequence gnx;
  public CharSequence gny;
  public l hpS;
  public int mKY;
  public CharSequence mKZ;
  private m.b mLa;
  m.a mLb;
  public String username;

  public m(int paramInt)
  {
    super(6, paramInt);
    AppMethodBeat.i(62016);
    this.mLa = new m.b(this);
    this.mLb = new m.a(this);
    AppMethodBeat.o(62016);
  }

  public a.b Ps()
  {
    return this.mLa;
  }

  public void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62017);
    parama = (m.a)parama;
    this.username = this.hpS.mDx;
    this.gnx = com.tencent.mm.pluginsdk.ui.e.j.d(paramContext, com.tencent.mm.plugin.fts.a.d.LC(this.username), parama.ejp.getTextSize());
    if ((this.hpS.userData instanceof Integer))
      this.mKY = ((Integer)this.hpS.userData).intValue();
    Object localObject1;
    label282: label303: Object localObject2;
    if (this.mKY < 2)
    {
      localObject1 = "";
      parama = "";
      paramArrayOfObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(this.hpS.mEB);
      switch (this.hpS.mDw)
      {
      default:
        paramArrayOfObject = (Object[])localObject1;
      case 41:
        while (true)
        {
          this.gny = com.tencent.mm.pluginsdk.ui.e.j.d(paramContext, bo.bc(parama, "").replace('\n', ' '), b.c.mHy);
          if (bo.ac(paramArrayOfObject))
            break;
          float f1 = b.a.mHq;
          float f2 = b.c.mHz.measureText(paramArrayOfObject.toString());
          this.gny = f.a(com.tencent.mm.plugin.fts.a.a.d.a(this.gny, this.mDz, f1 - f2, b.c.mHz)).mDR;
          this.gny = TextUtils.concat(new CharSequence[] { paramArrayOfObject, this.gny });
          this.mKZ = com.tencent.mm.pluginsdk.f.h.c(paramContext, this.hpS.timestamp, true);
          AppMethodBeat.o(62017);
          return;
          localObject2 = paramArrayOfObject.field_content;
          parama = (a.a)localObject2;
          paramArrayOfObject = (Object[])localObject1;
          if (t.mN(this.username))
          {
            parama = bf.oz((String)localObject2);
            paramArrayOfObject = (Object[])localObject1;
          }
        }
      case 42:
        parama = j.b.me(paramArrayOfObject.field_content);
        if (parama == null)
          break;
      case 43:
      case 48:
      case 49:
      case 44:
      case 45:
      case 46:
      case 47:
      case 50:
      }
    }
    for (parama = parama.title; ; parama = "")
    {
      paramArrayOfObject = paramContext.getString(2131300125);
      break;
      paramArrayOfObject = j.b.me(paramArrayOfObject.field_content);
      if (paramArrayOfObject != null)
        parama = paramArrayOfObject.title;
      paramArrayOfObject = paramContext.getString(2131300126);
      break;
      paramArrayOfObject = j.b.me(paramArrayOfObject.field_content);
      if (paramArrayOfObject != null)
        parama = paramArrayOfObject.title;
      paramArrayOfObject = paramContext.getString(2131300124);
      break;
      paramArrayOfObject = j.b.me(paramArrayOfObject.field_content);
      if (paramArrayOfObject != null)
        parama = paramArrayOfObject.description;
      paramArrayOfObject = paramContext.getString(2131300128);
      break;
      localObject2 = j.b.me(paramArrayOfObject.field_content);
      paramArrayOfObject = (Object[])localObject1;
      if (localObject2 == null)
        break;
      paramArrayOfObject = ((j.b)localObject2).title + ": ";
      parama = ((j.b)localObject2).description;
      break;
      localObject2 = j.b.me(paramArrayOfObject.field_content);
      paramArrayOfObject = (Object[])localObject1;
      if (localObject2 == null)
        break;
      parama = bo.bc(((j.b)localObject2).title, "") + ": " + bo.bc(((j.b)localObject2).description, "");
      paramArrayOfObject = (Object[])localObject1;
      break;
      parama = j.b.me(paramArrayOfObject.field_content);
      if (parama != null)
      {
        if (paramArrayOfObject.field_isSend == 1)
        {
          parama = bo.bc(parama.fhW, "") + ": " + bo.bc(parama.fhT, "");
          paramArrayOfObject = (Object[])localObject1;
          break;
        }
        parama = bo.bc(parama.fhW, "") + ": " + bo.bc(parama.fhS, "");
        paramArrayOfObject = (Object[])localObject1;
        break;
      }
      parama = "";
      paramArrayOfObject = (Object[])localObject1;
      break;
      paramArrayOfObject = paramArrayOfObject.field_content;
      if (t.kH(this.username))
        paramArrayOfObject = bf.oz(paramArrayOfObject);
      while (true)
      {
        parama = paramArrayOfObject;
        if (!bo.isNullOrNil(paramArrayOfObject))
        {
          localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Ro(paramArrayOfObject);
          parama = paramArrayOfObject;
          if (((bi.b)localObject1).dua())
            parama = ((bi.b)localObject1).eUu;
        }
        paramArrayOfObject = paramContext.getString(2131300127);
        break;
        this.gny = f.a(com.tencent.mm.plugin.fts.a.a.d.a(this.gny, this.mDz, b.a.mHq, b.c.mHz)).mDR;
        break label282;
        this.gny = paramContext.getResources().getString(2131302851, new Object[] { Integer.valueOf(this.mKY) });
        AppMethodBeat.o(62017);
        break label303;
      }
    }
  }

  public final int aAq()
  {
    return this.hpS.mEK;
  }

  public int bAw()
  {
    if (this.mKY < 2);
    for (int i = 0; ; i = 1)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.m
 * JD-Core Version:    0.6.2
 */