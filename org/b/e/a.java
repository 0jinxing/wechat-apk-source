package org.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.b.c.e;
import org.b.c.f;
import org.b.d.i;
import org.b.d.j;
import org.b.d.k;

public final class a
  implements b
{
  private org.b.d.a BZj;
  private org.b.a.a.b BZk;

  public a(org.b.a.a.b paramb, org.b.d.a parama)
  {
    this.BZk = paramb;
    this.BZj = parama;
  }

  private void a(org.b.d.c paramc, i parami)
  {
    AppMethodBeat.i(77293);
    paramc.jl("oauth_timestamp", new org.b.f.d().enm());
    paramc.jl("oauth_nonce", new org.b.f.d().getNonce());
    paramc.jl("oauth_consumer_key", this.BZj.BYE);
    paramc.jl("oauth_signature_method", new org.b.f.a().enl());
    paramc.jl("oauth_version", "1.0");
    if (this.BZj.emX())
      paramc.jl("scope", this.BZj.scope);
    paramc.jl("oauth_signature", b(paramc, parami));
    this.BZj.log("appended additional OAuth parameters: " + org.b.g.b.x(paramc.BYN));
    AppMethodBeat.o(77293);
  }

  private String b(org.b.d.c paramc, i parami)
  {
    AppMethodBeat.i(77297);
    this.BZj.log("generating signature...");
    paramc = new org.b.c.c().a(paramc);
    parami = new org.b.f.a().aL(paramc, this.BZj.BYF, parami.wFn);
    this.BZj.log("base string is: ".concat(String.valueOf(paramc)));
    this.BZj.log("signature is: ".concat(String.valueOf(parami)));
    AppMethodBeat.o(77297);
    return parami;
  }

  private void b(org.b.d.c paramc)
  {
    AppMethodBeat.i(77298);
    switch (enk()[this.BZj.BYI.ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(77298);
      while (true)
      {
        return;
        this.BZj.log("using Http Header signature");
        paramc.addHeader("Authorization", new e().a(paramc));
        AppMethodBeat.o(77298);
      }
      this.BZj.log("using Querystring signature");
      Iterator localIterator = paramc.BYN.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramc.jm((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
  }

  public final i a(i parami, k paramk)
  {
    AppMethodBeat.i(77294);
    this.BZj.log("obtaining access token from " + this.BZk.emW());
    org.b.d.c localc = new org.b.d.c(j.BZb, this.BZk.emW());
    localc.jl("oauth_token", parami.token);
    localc.jl("oauth_verifier", paramk.value);
    this.BZj.log("setting token to: " + parami + " and verifier to: " + paramk);
    a(localc, parami);
    b(localc);
    parami = localc.enc();
    parami = new org.b.c.g().awU(parami.getBody());
    AppMethodBeat.o(77294);
    return parami;
  }

  public final void a(i parami, org.b.d.c paramc)
  {
    AppMethodBeat.i(77295);
    this.BZj.log("signing request: " + paramc.ena());
    if (("".equals(parami.token)) && ("".equals(parami.wFn)));
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        paramc.jl("oauth_token", parami.token);
      this.BZj.log("setting token to: ".concat(String.valueOf(parami)));
      a(paramc, parami);
      b(paramc);
      AppMethodBeat.o(77295);
      return;
    }
  }

  public final String b(i parami)
  {
    AppMethodBeat.i(77296);
    parami = this.BZk.b(parami);
    AppMethodBeat.o(77296);
    return parami;
  }

  public final i enj()
  {
    AppMethodBeat.i(77292);
    this.BZj.log("obtaining request token from " + this.BZk.emV());
    Object localObject = new org.b.d.c(j.BZb, this.BZk.emV());
    this.BZj.log("setting oauth_callback to " + this.BZj.BYG);
    ((org.b.d.c)localObject).jl("oauth_callback", this.BZj.BYG);
    a((org.b.d.c)localObject, org.b.d.b.BYM);
    b((org.b.d.c)localObject);
    this.BZj.log("sending request...");
    localObject = ((org.b.d.c)localObject).enc();
    String str = ((org.b.d.g)localObject).getBody();
    this.BZj.log("response status code: " + ((org.b.d.g)localObject).code);
    this.BZj.log("response body: ".concat(String.valueOf(str)));
    localObject = new org.b.c.g().awU(str);
    AppMethodBeat.o(77292);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     org.b.e.a
 * JD-Core Version:    0.6.2
 */