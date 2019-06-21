package com.tencent.mm.audio.mix.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.e.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public Object ckQ;
  public com.tencent.mm.audio.mix.f.d clB;
  public HashMap<String, b> clC;
  public HashMap<String, com.tencent.mm.ag.b> clD;
  public List<String> clE;
  public LinkedList<String> clF;

  public a(com.tencent.mm.audio.mix.f.d paramd)
  {
    AppMethodBeat.i(137038);
    this.clC = new HashMap();
    this.clD = new HashMap();
    this.clE = new ArrayList();
    this.clF = new LinkedList();
    this.ckQ = new Object();
    this.clB = paramd;
    com.tencent.mm.audio.mix.b.d.Dm().clearCache();
    AppMethodBeat.o(137038);
  }

  public final void Du()
  {
    AppMethodBeat.i(137041);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "stopAll");
    Iterator localIterator = this.clF.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (b)this.clC.get(localObject);
      if ((localObject != null) && (!((b)localObject).clI) && (!((b)localObject).Dv()))
      {
        localObject = ((b)localObject).clJ;
        if (localObject != null)
          ((k)localObject).stop();
      }
    }
    AppMethodBeat.o(137041);
  }

  public final boolean b(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(137044);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "doDecodeAudio");
    if (this.clB == null)
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "mPlayer is null!");
      AppMethodBeat.o(137044);
      paramBoolean1 = false;
    }
    while (true)
    {
      return paramBoolean1;
      com.tencent.mm.ag.b localb = (com.tencent.mm.ag.b)this.clD.get(paramString);
      if (localb == null)
      {
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "param for id %s is not exist!", new Object[] { paramString });
        AppMethodBeat.o(137044);
        paramBoolean1 = false;
      }
      else
      {
        Object localObject = (b)this.clC.get(paramString);
        k localk;
        if (localObject != null)
        {
          if ((((b)localObject).clI) && (!this.clB.cnB.DB()) && (!this.clB.cnB.dM(paramString)))
          {
            com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "task is end, but not to play end");
            AppMethodBeat.o(137044);
            paramBoolean1 = true;
          }
          else if (((b)localObject).clI)
          {
            com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "task is end, reset source and decoder to run");
            ((b)localObject).clI = false;
            paramString = new com.tencent.mm.audio.mix.g.a(localb);
            ((b)localObject).b(f.a(this.clB, paramString, paramBoolean2));
            h.a((i)localObject);
            AppMethodBeat.o(137044);
            paramBoolean1 = true;
          }
          else
          {
            localk = ((b)localObject).clJ;
            if ((localk != null) && (paramBoolean1))
            {
              com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "force decode to stop and create new task to run");
              localk.stop();
            }
          }
        }
        else
        {
          do
          {
            com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "task is not exist, create new task to run");
            localObject = new com.tencent.mm.audio.mix.g.a(localb);
            localk = f.a(this.clB, (com.tencent.mm.audio.mix.g.b)localObject, paramBoolean2);
            localObject = new b(new a.1(this), paramString);
            ((b)localObject).b(localk);
            h.a((i)localObject);
            this.clC.put(paramString, localObject);
            AppMethodBeat.o(137044);
            paramBoolean1 = true;
            break;
            if ((localk != null) && (localk.DA()) && (!localk.DB()))
            {
              com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "resume decoder to run");
              localk.resume();
              AppMethodBeat.o(137044);
              paramBoolean1 = true;
              break;
            }
            if ((localk != null) && (localk.DB()))
            {
              com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "decoder to stop, reset task run");
              ((b)localObject).clI = false;
              paramString = new com.tencent.mm.audio.mix.g.a(localb);
              ((b)localObject).b(f.a(this.clB, paramString, paramBoolean2));
              h.a((i)localObject);
              AppMethodBeat.o(137044);
              paramBoolean1 = true;
              break;
            }
          }
          while (localk == null);
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "task is run and playing audio");
          AppMethodBeat.o(137044);
          paramBoolean1 = true;
        }
      }
    }
  }

  public final void clearCache()
  {
    AppMethodBeat.i(137039);
    this.clC.clear();
    this.clF.clear();
    this.clD.clear();
    AppMethodBeat.o(137039);
  }

  public final boolean dB(String paramString)
  {
    AppMethodBeat.i(137040);
    synchronized (this.ckQ)
    {
      boolean bool = this.clE.contains(paramString);
      AppMethodBeat.o(137040);
      return bool;
    }
  }

  public final void dC(String paramString)
  {
    AppMethodBeat.i(137042);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "startDecode audioId:%s", new Object[] { paramString });
    b(paramString, false, false);
    AppMethodBeat.o(137042);
  }

  public final void dD(String paramString)
  {
    AppMethodBeat.i(137043);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "stopDecode audioId:%s", new Object[] { paramString });
    b localb = (b)this.clC.get(paramString);
    if (localb == null)
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "task is not exist");
      AppMethodBeat.o(137043);
    }
    while (true)
    {
      return;
      if (localb.clI)
      {
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "task is execute end!");
        AppMethodBeat.o(137043);
      }
      else
      {
        k localk = localb.clJ;
        if (localk != null)
        {
          localk.stop();
          localb.clJ = null;
          this.clC.remove(paramString);
        }
        AppMethodBeat.o(137043);
      }
    }
  }

  public final boolean dE(String paramString)
  {
    AppMethodBeat.i(137047);
    paramString = (b)this.clC.get(paramString);
    boolean bool;
    if (paramString == null)
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "task is not exist");
      AppMethodBeat.o(137047);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (paramString.clI)
      {
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "task is execute end!");
        AppMethodBeat.o(137047);
        bool = true;
      }
      else if (paramString.Dv())
      {
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "task is isDetach!");
        AppMethodBeat.o(137047);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(137047);
      }
    }
  }

  public final boolean dF(String paramString)
  {
    AppMethodBeat.i(137048);
    b localb = (b)this.clC.get(paramString);
    boolean bool;
    if ((localb != null) && (localb.clI) && (!this.clB.cnB.DB()) && (!this.clB.cnB.dM(paramString)))
    {
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "task is end, but not to play end");
      bool = true;
      AppMethodBeat.o(137048);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137048);
    }
  }

  public final boolean u(String paramString, int paramInt)
  {
    AppMethodBeat.i(137045);
    boolean bool;
    if (!v(paramString, paramInt))
    {
      AppMethodBeat.o(137045);
      bool = false;
    }
    while (true)
    {
      return bool;
      v(paramString, paramInt);
      paramString = (b)this.clC.get(paramString);
      if (paramString == null)
      {
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "task is not exist");
        AppMethodBeat.o(137045);
        bool = false;
      }
      else if (paramString.clI)
      {
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "task is execute end!");
        AppMethodBeat.o(137045);
        bool = false;
      }
      else if (paramString.Dv())
      {
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "task is isDetach!");
        AppMethodBeat.o(137045);
        bool = false;
      }
      else
      {
        paramString = paramString.clJ;
        if (paramString != null)
          paramString.seek(paramInt);
        bool = true;
        AppMethodBeat.o(137045);
      }
    }
  }

  public final boolean v(String paramString, int paramInt)
  {
    AppMethodBeat.i(137046);
    com.tencent.mm.ag.b localb = (com.tencent.mm.ag.b)this.clD.get(paramString);
    if (localb == null)
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "param for id %s is not exist!", new Object[] { paramString });
      AppMethodBeat.o(137046);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      localb.startTime = paramInt;
      AppMethodBeat.o(137046);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.d.a
 * JD-Core Version:    0.6.2
 */