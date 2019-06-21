package com.tencent.mm.plugin.appbrand.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.a.a;
import com.tencent.mm.af.a.b;
import com.tencent.mm.g.b.a.cs;
import com.tencent.mm.g.b.a.cs.a;
import com.tencent.mm.g.b.a.cs.b;
import com.tencent.mm.g.b.a.cs.c;
import com.tencent.mm.g.b.a.cs.d;
import com.tencent.mm.g.b.a.cs.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.k;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.service.d.a;

final class a$1$1
  implements d.a
{
  a$1$1(a.1 param1)
  {
  }

  public final void d(WxaAttributes paramWxaAttributes)
  {
    AppMethodBeat.i(132264);
    b localb = ((k)g.K(k.class)).pn(this.ino.ink.bQi);
    Object localObject1 = cs.d.dhY;
    cs.e locale1 = cs.e.dic;
    Object localObject2 = localObject1;
    cs.e locale2 = locale1;
    label77: int i;
    if (localb != null)
    {
      if (localb.field_msgState == 1)
      {
        localObject1 = cs.d.dia;
        if (localb.field_btnState != 2)
          break label245;
        locale2 = cs.e.die;
        localObject2 = localObject1;
      }
    }
    else
    {
      if (paramWxaAttributes.ayJ() != null)
        break label278;
      i = 0;
      label87: localObject1 = new cs().hE(this.ino.ink.appId).hF(this.ino.ink.path).hG(this.ino.ink.path).hH(this.ino.inl);
      if (!this.ino.inl.toLowerCase().endsWith("@chatroom"))
        break label290;
    }
    label278: label290: for (paramWxaAttributes = cs.c.dhV; ; paramWxaAttributes = cs.c.dhW)
    {
      ((cs)localObject1).dhB = paramWxaAttributes;
      ((cs)localObject1).dhC = cs.b.dhS;
      ((cs)localObject1).cVR = 0L;
      paramWxaAttributes = ((cs)localObject1).hI("");
      paramWxaAttributes.dhG = cs.a.hp(i + 1000);
      paramWxaAttributes = paramWxaAttributes.Hk();
      paramWxaAttributes.dhE = localObject2;
      paramWxaAttributes.dhF = locale2;
      paramWxaAttributes.ajK();
      AppMethodBeat.o(132264);
      return;
      if (localb.field_msgState != 0)
        break;
      localObject1 = cs.d.dhZ;
      break;
      label245: if (localb.field_btnState != 0)
      {
        localObject2 = localObject1;
        locale2 = locale1;
        if (localb.field_btnState != 1)
          break label77;
      }
      locale2 = cs.e.did;
      localObject2 = localObject1;
      break label77;
      i = paramWxaAttributes.ayJ().fmr;
      break label87;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.a.1.1
 * JD-Core Version:    0.6.2
 */