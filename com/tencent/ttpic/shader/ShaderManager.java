package com.tencent.ttpic.shader;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShaderManager
{
  private static final ThreadLocal<ShaderManager> shaderManager;
  private Map<ShaderCreateFactory.PROGRAM_TYPE, Shader> shaderMap;

  static
  {
    AppMethodBeat.i(83744);
    shaderManager = new ShaderManager.1();
    AppMethodBeat.o(83744);
  }

  public ShaderManager()
  {
    AppMethodBeat.i(83737);
    this.shaderMap = new HashMap();
    AppMethodBeat.o(83737);
  }

  public static ShaderManager getInstance()
  {
    AppMethodBeat.i(83740);
    ShaderManager localShaderManager = (ShaderManager)shaderManager.get();
    AppMethodBeat.o(83740);
    return localShaderManager;
  }

  public boolean bind(ShaderCreateFactory.PROGRAM_TYPE paramPROGRAM_TYPE)
  {
    AppMethodBeat.i(83738);
    paramPROGRAM_TYPE = (Shader)this.shaderMap.get(paramPROGRAM_TYPE);
    boolean bool;
    if (paramPROGRAM_TYPE == null)
    {
      bool = false;
      AppMethodBeat.o(83738);
    }
    while (true)
    {
      return bool;
      paramPROGRAM_TYPE.bind();
      bool = true;
      AppMethodBeat.o(83738);
    }
  }

  public void clear()
  {
    AppMethodBeat.i(83743);
    Iterator localIterator = this.shaderMap.values().iterator();
    while (localIterator.hasNext())
      ((Shader)localIterator.next()).clear();
    this.shaderMap.clear();
    AppMethodBeat.o(83743);
  }

  public boolean clearShader(ShaderCreateFactory.PROGRAM_TYPE paramPROGRAM_TYPE)
  {
    AppMethodBeat.i(83742);
    Shader localShader = (Shader)this.shaderMap.get(paramPROGRAM_TYPE);
    boolean bool;
    if (localShader == null)
    {
      bool = false;
      AppMethodBeat.o(83742);
    }
    while (true)
    {
      return bool;
      localShader.clear();
      this.shaderMap.remove(paramPROGRAM_TYPE);
      bool = true;
      AppMethodBeat.o(83742);
    }
  }

  public void compile()
  {
    AppMethodBeat.i(83741);
    Iterator localIterator = this.shaderMap.values().iterator();
    while (localIterator.hasNext())
      ((Shader)localIterator.next()).compile();
    AppMethodBeat.o(83741);
  }

  public Shader getShader(ShaderCreateFactory.PROGRAM_TYPE paramPROGRAM_TYPE)
  {
    AppMethodBeat.i(83739);
    if (!this.shaderMap.containsKey(paramPROGRAM_TYPE))
    {
      Shader localShader = ShaderCreateFactory.createShader(paramPROGRAM_TYPE);
      this.shaderMap.put(paramPROGRAM_TYPE, localShader);
    }
    paramPROGRAM_TYPE = (Shader)this.shaderMap.get(paramPROGRAM_TYPE);
    AppMethodBeat.o(83739);
    return paramPROGRAM_TYPE;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.shader.ShaderManager
 * JD-Core Version:    0.6.2
 */