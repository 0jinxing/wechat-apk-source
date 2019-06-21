package com.tencent.mm.ipcinvoker.wx_extension;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.service.MainProcessIPCService;
import com.tencent.mm.ipcinvoker.wx_extension.service.SupportProcessIPCService;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsMpProcessIPCService;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;

final class PluginIPC$1 extends com.tencent.mm.ipcinvoker.a.a
{
  PluginIPC$1(PluginIPC paramPluginIPC)
  {
  }

  public final void a(com.tencent.mm.ipcinvoker.a.d paramd)
  {
    AppMethodBeat.i(126203);
    super.a(paramd);
    paramd.a(PluginIPC.a.eGG);
    AppMethodBeat.o(126203);
  }

  public final void a(com.tencent.mm.ipcinvoker.a.e parame)
  {
    AppMethodBeat.i(126204);
    super.a(parame);
    parame.a(new d());
    parame.a(new a());
    parame.a(new e());
    AppMethodBeat.o(126204);
  }

  public final void b(com.tencent.mm.ipcinvoker.a.d paramd)
  {
    AppMethodBeat.i(126205);
    paramd.a("com.tencent.mm", MainProcessIPCService.class);
    paramd.a("com.tencent.mm:tools", ToolsProcessIPCService.class);
    paramd.a("com.tencent.mm:toolsmp", ToolsMpProcessIPCService.class);
    paramd.a("com.tencent.mm:support", SupportProcessIPCService.class);
    AppMethodBeat.o(126205);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.wx_extension.PluginIPC.1
 * JD-Core Version:    0.6.2
 */