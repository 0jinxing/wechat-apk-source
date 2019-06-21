package com.tencent.soter.a.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.b.c;
import com.tencent.soter.core.a;
import com.tencent.soter.core.c.d;
import com.tencent.soter.core.c.f;
import com.tencent.soter.core.c.g;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10473);
    Object localObject = this.AvX;
    if ((((b)localObject).AvR & 0x1) != 1)
      if ((((b)localObject).AvR & 0x2) == 2)
      {
        if (!g.isNullOrNil(((b)localObject).AvS))
          break label111;
        d.e("Soter.SoterKeyGenerateEngine", "soter: not pass auth key name", new Object[0]);
        localObject = new c(1, "auth key name not specified");
        if (((c)localObject).isSuccess())
          break label123;
        b.a(this.AvX, (f)localObject);
        AppMethodBeat.o(10473);
      }
    while (true)
    {
      return;
      d.e("Soter.SoterKeyGenerateEngine", "soter: not specified purpose", new Object[0]);
      localObject = new c(7, "not specified purpose. did you for get to call markGenAppSecureKey or/and markGenAuthKey?");
      break;
      label111: localObject = new c(0);
      break;
      label123: if (!a.dQN())
      {
        d.w("Soter.SoterKeyGenerateEngine", "soter: native not support soter", new Object[0]);
        b.a(this.AvX, new c(2));
        AppMethodBeat.o(10473);
      }
      else if ((this.AvX.AvR & 0x1) == 1)
      {
        d.d("Soter.SoterKeyGenerateEngine", "soter: require generate ask. start gen", new Object[0]);
        if ((this.AvX.AvT) && (a.dQQ()))
        {
          d.d("Soter.SoterKeyGenerateEngine", "soter: request regen ask. remove former one", new Object[0]);
          localObject = a.dQP();
          if (!((f)localObject).isSuccess())
          {
            d.w("Soter.SoterKeyGenerateEngine", "soter: remove ask failed: %s", new Object[] { ((f)localObject).aIm });
            b.a(this.AvX, (f)localObject);
            AppMethodBeat.o(10473);
          }
        }
        else
        {
          localObject = a.dQO();
          if (!((f)localObject).isSuccess())
          {
            d.w("Soter.SoterKeyGenerateEngine", "soter: generate ask failed: %s", new Object[] { ((f)localObject).aIm });
            a.dQP();
            b.a(this.AvX, (f)localObject);
            AppMethodBeat.o(10473);
          }
          else
          {
            d.i("Soter.SoterKeyGenerateEngine", "soter: generate ask success!", new Object[0]);
            b.a(this.AvX, (f)localObject);
          }
        }
      }
      else if ((this.AvX.AvR & 0x2) == 2)
      {
        d.d("Soter.SoterKeyGenerateEngine", "soter: require generate auth key. start gen: %s", new Object[] { this.AvX.AvS });
        if (!a.dQR())
        {
          d.w("Soter.SoterKeyGenerateEngine", "soter: no ask.", new Object[0]);
          b.a(this.AvX, new c(3, "ASK not exists when generate auth key"));
          AppMethodBeat.o(10473);
        }
        else if ((this.AvX.AvU) && (a.aua(this.AvX.AvS)))
        {
          d.d("Soter.SoterKeyGenerateEngine", "soter: request regen auth key. remove former one", new Object[0]);
          localObject = a.cn(this.AvX.AvS, false);
          if (!((f)localObject).isSuccess())
          {
            d.w("Soter.SoterKeyGenerateEngine", "soter: remove auth key %s, failed: %s", new Object[] { this.AvX.AvS, ((f)localObject).aIm });
            b.a(this.AvX, (f)localObject);
            AppMethodBeat.o(10473);
          }
        }
        else
        {
          localObject = a.atZ(this.AvX.AvS);
          if (!((f)localObject).isSuccess())
          {
            d.w("Soter.SoterKeyGenerateEngine", "soter: generate auth key %s failed: %s", new Object[] { this.AvX.AvS, ((f)localObject).aIm });
            a.cn(this.AvX.AvS, true);
            b.a(this.AvX, (f)localObject);
            AppMethodBeat.o(10473);
          }
          else
          {
            d.i("Soter.SoterKeyGenerateEngine", "soter: generate auth key success!", new Object[0]);
            b.a(this.AvX, (f)localObject);
          }
        }
      }
      else
      {
        AppMethodBeat.o(10473);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.e.b.1
 * JD-Core Version:    0.6.2
 */