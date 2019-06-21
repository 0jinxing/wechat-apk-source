package com.eclipsesource.v8.debug;

import com.eclipsesource.v8.V8Object;

public abstract interface BreakHandler
{
  public abstract void onBreak(DebugHandler.DebugEvent paramDebugEvent, ExecutionState paramExecutionState, EventData paramEventData, V8Object paramV8Object);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.BreakHandler
 * JD-Core Version:    0.6.2
 */