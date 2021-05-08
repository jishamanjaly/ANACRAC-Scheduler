package org.apache.hadoop.yarn.server.api.records;

import org.apache.hadoop.classification.InterfaceAudience.Private;
import org.apache.hadoop.classification.InterfaceAudience.Public;
import org.apache.hadoop.classification.InterfaceStability.Stable;
import org.apache.hadoop.yarn.util.Records;

@Public
@Stable
// JISHA
public abstract class NodeResourceStatus {
	
	  @Private
	  public static NodeResourceStatus newInstance(float avgCpuUsage,
	      float avgIOUsage) {
		  NodeResourceStatus status = Records.newRecord(NodeResourceStatus.class);
	    status.setAvgCpuUsage(avgCpuUsage);
	    status.setAvgIOUsage(avgIOUsage);
	    return status;
	  }
	  
    public abstract void setAvgCpuUsage(float avgCpuUsage);
    
	public abstract float getAvgCpuUsage();

	public abstract float getAvgIOUsage();

	public abstract void setAvgIOUsage(float avgIOUsage);
}
