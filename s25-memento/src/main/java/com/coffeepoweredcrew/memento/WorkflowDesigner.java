package com.coffeepoweredcrew.memento;

public class WorkflowDesigner {

    private Workflow workflow;

    public void createWorkflow(String name) {
        workflow = new Workflow(name);
    }

    public Workflow getWorkflow() {
        return this.workflow;
    }

    public Memento getMemento() {
    	if(workflow==null) {
    		return new Memento();
    	}
       return new Memento(workflow.getSteps(), workflow.getName());
    }

    public void setMemento(Memento memento) {
    	if(memento.isEmpty()) {
    		this.workflow = null;
    	} else {
    		this.workflow = new Workflow(memento.getName(), memento.getSteps());
    	}
    }

    public void addStep(String step) {
        workflow.addStep(step);
    }

    public void removeStep(String step) {
        workflow.removeStep(step);
    }

    public void print() {
        System.out.println(workflow);
    }

    public class Memento {
    	
    	private String[] steps;
    	private String name;
    	
    	public Memento() {		
		}
    	
    	public boolean isEmpty() {
			return this.getSteps()==null && this.getName()==null;
		}

		private Memento(String[] steps, String name) {
			this.setSteps(steps);
			this.setName(name);
		}

		public String[] getSteps() {
			return steps;
		}

		public void setSteps(String[] steps) {
			this.steps = steps;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
    	
    }
}
