package com.eclipsesource.v8.debug.mirror;

import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Value;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Scope extends Mirror
{
  private static final String SCOPE_OBJECT = "scopeObject";
  private static final String SCOPE_TYPE = "scopeType";
  private static final String SET_VARIABLE_VALUE = "setVariableValue";

  Scope(V8Object paramV8Object)
  {
    super(paramV8Object);
  }

  public ObjectMirror getScopeObject()
  {
    Object localObject1 = null;
    AppMethodBeat.i(74908);
    try
    {
      V8Object localV8Object = this.v8Object.executeObjectFunction("scopeObject", null);
      localObject1 = localV8Object;
      ObjectMirror localObjectMirror = (ObjectMirror)createMirror(localV8Object);
      return localObjectMirror;
    }
    finally
    {
      if (localObject1 != null)
        localObject1.release();
      AppMethodBeat.o(74908);
    }
  }

  public Scope.ScopeType getType()
  {
    AppMethodBeat.i(74902);
    Scope.ScopeType localScopeType = Scope.ScopeType.values()[this.v8Object.executeIntegerFunction("scopeType", null)];
    AppMethodBeat.o(74902);
    return localScopeType;
  }

  public void setVariableValue(String paramString, double paramDouble)
  {
    AppMethodBeat.i(74907);
    V8Array localV8Array = new V8Array(this.v8Object.getRuntime());
    localV8Array.push(paramString);
    localV8Array.push(paramDouble);
    try
    {
      this.v8Object.executeVoidFunction("setVariableValue", localV8Array);
      return;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74907);
    }
    throw paramString;
  }

  public void setVariableValue(String paramString, int paramInt)
  {
    AppMethodBeat.i(74903);
    V8Array localV8Array = new V8Array(this.v8Object.getRuntime());
    localV8Array.push(paramString);
    localV8Array.push(paramInt);
    try
    {
      this.v8Object.executeVoidFunction("setVariableValue", localV8Array);
      return;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74903);
    }
    throw paramString;
  }

  public void setVariableValue(String paramString, V8Value paramV8Value)
  {
    AppMethodBeat.i(74904);
    V8Array localV8Array = new V8Array(this.v8Object.getRuntime());
    localV8Array.push(paramString);
    localV8Array.push(paramV8Value);
    try
    {
      this.v8Object.executeVoidFunction("setVariableValue", localV8Array);
      return;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74904);
    }
    throw paramString;
  }

  public void setVariableValue(String paramString1, String paramString2)
  {
    AppMethodBeat.i(74906);
    V8Array localV8Array = new V8Array(this.v8Object.getRuntime());
    localV8Array.push(paramString1);
    localV8Array.push(paramString2);
    try
    {
      this.v8Object.executeVoidFunction("setVariableValue", localV8Array);
      return;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74906);
    }
    throw paramString1;
  }

  public void setVariableValue(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(74905);
    V8Array localV8Array = new V8Array(this.v8Object.getRuntime());
    localV8Array.push(paramString);
    localV8Array.push(paramBoolean);
    try
    {
      this.v8Object.executeVoidFunction("setVariableValue", localV8Array);
      return;
    }
    finally
    {
      localV8Array.release();
      AppMethodBeat.o(74905);
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.mirror.Scope
 * JD-Core Version:    0.6.2
 */