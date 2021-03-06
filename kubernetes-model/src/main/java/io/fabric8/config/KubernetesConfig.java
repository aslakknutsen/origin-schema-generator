package io.fabric8.config;

import io.sundr.builder.annotations.ExternalBuildables;

@ExternalBuildables(editableEnabled=false, validationEnabled = true, builderPackage = "io.fabric8.common", value = {
        "io.fabric8.kubernetes.api.model.BaseKubernetesList",
        "io.fabric8.kubernetes.api.model.KubernetesList",

        "io.fabric8.kubernetes.api.model.Capabilities",
        "io.fabric8.kubernetes.api.model.Container",
        "io.fabric8.kubernetes.api.model.ContainerPort",
        "io.fabric8.kubernetes.api.model.ContainerState",
        "io.fabric8.kubernetes.api.model.ContainerStateRunning",
        "io.fabric8.kubernetes.api.model.ContainerStateTerminated",
        "io.fabric8.kubernetes.api.model.ContainerStateWaiting",
        "io.fabric8.kubernetes.api.model.ContainerStatus",
        "io.fabric8.kubernetes.api.model.EmptyDirVolumeSource",
        "io.fabric8.kubernetes.api.model.EndpointAddress",
        "io.fabric8.kubernetes.api.model.EndpointPort",
        "io.fabric8.kubernetes.api.model.EndpointSubset",
        "io.fabric8.kubernetes.api.model.Endpoints",
        "io.fabric8.kubernetes.api.model.EndpointsList",
        "io.fabric8.kubernetes.api.model.EnvVar",
        "io.fabric8.kubernetes.api.model.EnvVarSource",
        "io.fabric8.kubernetes.api.model.ExecAction",
        "io.fabric8.kubernetes.api.model.GCEPersistentDiskVolumeSource",
        "io.fabric8.kubernetes.api.model.GitRepoVolumeSource",
        "io.fabric8.kubernetes.api.model.GlusterfsVolumeSource",
        "io.fabric8.kubernetes.api.model.HTTPGetAction",
        "io.fabric8.kubernetes.api.model.Handler",
        "io.fabric8.kubernetes.api.model.HostPathVolumeSource",
        "io.fabric8.kubernetes.api.model.ISCSIVolumeSource",
        "io.fabric8.kubernetes.api.model.KubeSchema",
        "io.fabric8.kubernetes.api.model.Lifecycle",
        "io.fabric8.kubernetes.api.model.ListMeta",
        "io.fabric8.kubernetes.api.model.NFSVolumeSource",
        "io.fabric8.kubernetes.api.model.Namespace",
        "io.fabric8.kubernetes.api.model.NamespaceList",
        "io.fabric8.kubernetes.api.model.NamespaceSpec",
        "io.fabric8.kubernetes.api.model.NamespaceStatus",
        "io.fabric8.kubernetes.api.model.Node",
        "io.fabric8.kubernetes.api.model.NodeAddress",
        "io.fabric8.kubernetes.api.model.NodeCondition",
        "io.fabric8.kubernetes.api.model.NodeList",
        "io.fabric8.kubernetes.api.model.NodeSpec",
        "io.fabric8.kubernetes.api.model.NodeStatus",
        "io.fabric8.kubernetes.api.model.NodeSystemInfo",
        "io.fabric8.kubernetes.api.model.ObjectFieldSelector",
        "io.fabric8.kubernetes.api.model.ObjectMeta",
        "io.fabric8.kubernetes.api.model.ObjectReference",
        "io.fabric8.kubernetes.api.model.Pod",
        "io.fabric8.kubernetes.api.model.PodCondition",
        "io.fabric8.kubernetes.api.model.PodList",
        "io.fabric8.kubernetes.api.model.PodSpec",
        "io.fabric8.kubernetes.api.model.PodStatus",
        "io.fabric8.kubernetes.api.model.PodTemplateSpec",
        "io.fabric8.kubernetes.api.model.Probe",
        "io.fabric8.kubernetes.api.model.ReplicationController",
        "io.fabric8.kubernetes.api.model.ReplicationControllerList",
        "io.fabric8.kubernetes.api.model.ReplicationControllerSpec",
        "io.fabric8.kubernetes.api.model.ReplicationControllerStatus",
        "io.fabric8.kubernetes.api.model.ResourceRequirements",
        "io.fabric8.kubernetes.api.model.Secret",
        "io.fabric8.kubernetes.api.model.SecretList",
        "io.fabric8.kubernetes.api.model.SecretVolumeSource",
        "io.fabric8.kubernetes.api.model.Service",
        "io.fabric8.kubernetes.api.model.ServiceAccount",
        "io.fabric8.kubernetes.api.model.ServiceAccountList",
        "io.fabric8.kubernetes.api.model.ServiceList",
        "io.fabric8.kubernetes.api.model.ServicePort",
        "io.fabric8.kubernetes.api.model.ServiceSpec",
        "io.fabric8.kubernetes.api.model.ServiceStatus",
        "io.fabric8.kubernetes.api.model.TCPSocketAction",
        "io.fabric8.kubernetes.api.model.Volume",
        "io.fabric8.kubernetes.api.model.VolumeMount",

        "io.fabric8.kubernetes.api.model.util.IntOrString",
        "io.fabric8.kubernetes.api.model.resource.Quantity"
})
public class KubernetesConfig {
}
